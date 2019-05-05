/*
 * Copyright 2012 The Error Prone Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.errorprone.bugpatterns;

import static com.google.errorprone.BugPattern.LinkType.NONE;
import static com.google.errorprone.BugPattern.SeverityLevel.ERROR;
import static com.google.errorprone.matchers.CompileTimeConstantExpressionMatcher.hasCompileTimeConstantAnnotation;

import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker.LambdaExpressionTreeMatcher;
import com.google.errorprone.bugpatterns.BugChecker.MemberReferenceTreeMatcher;
import com.google.errorprone.bugpatterns.BugChecker.MethodInvocationTreeMatcher;
import com.google.errorprone.bugpatterns.BugChecker.MethodTreeMatcher;
import com.google.errorprone.bugpatterns.BugChecker.NewClassTreeMatcher;
import com.google.errorprone.matchers.CompileTimeConstantExpressionMatcher;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matcher;
import com.google.errorprone.util.ASTHelpers;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.MemberReferenceTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.VariableTree;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Symbol.VarSymbol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Detects invocations of methods with a parameter annotated {@code @CompileTimeConstant} such that
 * the corresponding actual parameter is not a compile-time constant expression.
 *
 * <p>This type annotation checker enforces that for all method and constructor invocations, for all
 * formal parameters of the invoked method/constructor that are annotated with the {@link
 * com.google.errorprone.annotations.CompileTimeConstant} type annotation, the corresponding actual
 * parameter is an expression that satisfies one of the following conditions:
 *
 * <ol>
 *   <li>The expression is one for which the Java compiler can determine a constant value at compile
 *       time, or
 *   <li>the expression consists of the literal {@code null}, or
 *   <li>the expression consists of a single identifier, where the identifier is a formal method
 *       parameter that is declared {@code final} and has the {@link
 *       com.google.errorprone.annotations.CompileTimeConstant} annotation.
 * </ol>
 *
 * @see CompileTimeConstantExpressionMatcher
 */
@BugPattern(
    name = "CompileTimeConstant",
    summary =
        "Non-compile-time constant expression passed to parameter with "
            + "@CompileTimeConstant type annotation.",
    linkType = NONE,
    severity = ERROR,
    disableable = false,
    suppressionAnnotations = {}
    )
public class CompileTimeConstantChecker extends BugChecker
    implements LambdaExpressionTreeMatcher,
        MemberReferenceTreeMatcher,
        MethodInvocationTreeMatcher,
        MethodTreeMatcher,
        NewClassTreeMatcher {

  private static final String DID_YOU_MEAN_FINAL_FMT_MESSAGE = " Did you mean to make '%s' final?";

  private final Matcher<ExpressionTree> compileTimeConstExpressionMatcher =
      new CompileTimeConstantExpressionMatcher();

  /**
   * Matches formal parameters with {@link com.google.errorprone.annotations.CompileTimeConstant}
   * annotations against corresponding actual parameters.
   *
   * @param state the visitor state
   * @param calleeSymbol the method whose formal parameters to consider
   * @param actualParams the list of actual parameters
   * @return a {@code Description} of the match <i>iff</i> for any of the actual parameters that is
   *     annotated with {@link com.google.errorprone.annotations.CompileTimeConstant}, the
   *     corresponding formal parameter is not a compile-time-constant expression in the sense of
   *     {@link CompileTimeConstantExpressionMatcher}. Otherwise returns {@code
   *     Description.NO_MATCH}.
   */
  private Description matchArguments(
      VisitorState state,
      final Symbol.MethodSymbol calleeSymbol,
      Iterator<? extends ExpressionTree> actualParams) {
    Symbol.VarSymbol lastFormalParam = null;
    for (Symbol.VarSymbol formalParam : calleeSymbol.getParameters()) {
      lastFormalParam = formalParam;
      // It appears that for some reason, the Tree for implicit Enum constructors
      // includes an invocation of super(), but the target symbol has the signature
      // Enum(String, int). This resulted in NoSuchElementExceptions.
      // It is safe to return no match in this case, since even if this could happen
      // in another scenario, a non-existent actual parameter can't possibly
      // be a non-constant parameter for a @CompileTimeConstant formal.
      if (!actualParams.hasNext()) {
        return Description.NO_MATCH;
      }
      ExpressionTree actualParam = actualParams.next();
      if (hasCompileTimeConstantAnnotation(state, formalParam)) {
        if (!compileTimeConstExpressionMatcher.matches(actualParam, state)) {
          return handleMatch(actualParam, state);
        }
      }
    }

    // If the last formal parameter is a vararg and has the @CompileTimeConstant annotation,
    // we need to check the remaining args as well.
    if (lastFormalParam == null || (lastFormalParam.flags() & Flags.VARARGS) == 0) {
      return Description.NO_MATCH;
    }
    if (!hasCompileTimeConstantAnnotation(state, lastFormalParam)) {
      return Description.NO_MATCH;
    }
    while (actualParams.hasNext()) {
      ExpressionTree actualParam = actualParams.next();
      if (!compileTimeConstExpressionMatcher.matches(actualParam, state)) {
        return handleMatch(actualParam, state);
      }
    }
    return Description.NO_MATCH;
  }

  /**
   * If the non-constant variable is annotated with @CompileTimeConstant, it must have been
   * non-final. Suggest making it final in the error message.
   */
  private Description handleMatch(ExpressionTree actualParam, VisitorState state) {
    Symbol sym = ASTHelpers.getSymbol(actualParam);
    if (!(sym instanceof VarSymbol)) {
      return describeMatch(actualParam);
    }
    VarSymbol var = (VarSymbol) sym;
    if (!hasCompileTimeConstantAnnotation(state, var)) {
      return describeMatch(actualParam);
    }
    return buildDescription(actualParam)
        .setMessage(
            this.message() + String.format(DID_YOU_MEAN_FINAL_FMT_MESSAGE, var.getSimpleName()))
        .build();
  }

  @Override
  public Description matchNewClass(NewClassTree tree, VisitorState state) {
    Symbol.MethodSymbol sym = ASTHelpers.getSymbol(tree);
    if (sym == null) {
      return Description.NO_MATCH;
    }
    return matchArguments(state, sym, tree.getArguments().iterator());
  }

  @Override
  public Description matchMethodInvocation(MethodInvocationTree tree, VisitorState state) {
    Symbol.MethodSymbol sym = ASTHelpers.getSymbol(tree);
    if (sym == null) {
      return Description.NO_MATCH;
    }
    return matchArguments(state, sym, tree.getArguments().iterator());
  }

  @Override
  public Description matchMethod(MethodTree node, VisitorState state) {
    Symbol.MethodSymbol method = ASTHelpers.getSymbol(node);
    if (method == null) {
      return Description.NO_MATCH;
    }
    List<Integer> compileTimeConstantAnnotationIndexes = new ArrayList<>();
    for (int i = 0; i < method.getParameters().size(); i++) {
      if (hasCompileTimeConstantAnnotation(state, method.getParameters().get(i))) {
        compileTimeConstantAnnotationIndexes.add(i);
      }
    }
    if (compileTimeConstantAnnotationIndexes.isEmpty()) {
      return Description.NO_MATCH;
    }
    for (Symbol.MethodSymbol superMethod : ASTHelpers.findSuperMethods(method, state.getTypes())) {
      for (Integer index : compileTimeConstantAnnotationIndexes) {
        if (!hasCompileTimeConstantAnnotation(state, superMethod.getParameters().get(index))) {
          return buildDescription(node)
              .setMessage(
                  "Method with @CompileTimeConstant parameter can't override method without it.")
              .build();
        }
      }
    }
    return Description.NO_MATCH;
  }

  @Override
  public Description matchMemberReference(MemberReferenceTree tree, VisitorState state) {
    Symbol.MethodSymbol sym = ASTHelpers.getSymbol(tree);
    if (sym == null) {
      return Description.NO_MATCH;
    }
    for (Symbol.VarSymbol formalParam : sym.getParameters()) {
      if (hasCompileTimeConstantAnnotation(state, formalParam)) {
        // We couldn't check how the reference will be used. Simply disallow all references.
        return buildDescription(tree)
            .setMessage(
                "References to methods with @CompileTimeConstant parameters are not supported.")
            .build();
      }
    }
    return Description.NO_MATCH;
  }

  @Override
  public Description matchLambdaExpression(LambdaExpressionTree tree, VisitorState state) {
    for (VariableTree formalParam : tree.getParameters()) {
      if (hasCompileTimeConstantAnnotation(state, ASTHelpers.getSymbol(formalParam))) {
        // We couldn't check how the lambda expression will be used. Simply disallow all lambda
        // expressions.
        return buildDescription(tree)
            .setMessage(
                "Lambda expressions with @CompileTimeConstant parameters are not supported.")
            .build();
      }
    }
    return Description.NO_MATCH;
  }
}
