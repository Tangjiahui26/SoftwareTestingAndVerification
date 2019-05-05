/*
 * Copyright 2018 The Error Prone Authors.
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

import static com.google.errorprone.BugPattern.ProvidesFix.NO_FIX;
import static com.google.errorprone.BugPattern.SeverityLevel.WARNING;
import static com.google.errorprone.util.ASTHelpers.getReceiver;
import static com.google.errorprone.util.ASTHelpers.isSubtype;

import com.google.common.base.Optional;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.fixes.Fix;
import com.google.errorprone.fixes.SuggestedFix;
import com.google.errorprone.matchers.Matcher;
import com.google.errorprone.matchers.Matchers;
import com.google.errorprone.predicates.TypePredicate;
import com.google.errorprone.predicates.TypePredicates;
import com.google.errorprone.util.ASTHelpers;
import com.google.errorprone.util.FindIdentifiers;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Type;

/**
 * Flags {@code com.sun.source.tree.Tree#toString} usage in {@link BugChecker}s.
 *
 * @author bhagwani@google.com (Sumit Bhagwani)
 */
@BugPattern(
    name = "TreeToString",
    summary =
        "Tree#toString shouldn't be used for Trees deriving from the code being "
            + "compiled, as it discards whitespace and comments.",
    severity = WARNING,
    providesFix = NO_FIX)
public class TreeToString extends AbstractToString {

  private static final Matcher<ClassTree> IS_BUGCHECKER =
      Matchers.isSubtypeOf("com.google.errorprone.bugpatterns.BugChecker");

  private static final TypePredicate IS_TREE =
      TypePredicates.isDescendantOf("com.sun.source.tree.Tree");

  private static boolean treeToStringInBugChecker(Type type, VisitorState state) {
    ClassTree enclosingClass = ASTHelpers.findEnclosingNode(state.getPath(), ClassTree.class);
    if (enclosingClass == null || !IS_BUGCHECKER.matches(enclosingClass, state)) {
      return false;
    }
    return IS_TREE.apply(type, state);
  }

  @Override
  protected TypePredicate typePredicate() {
    return TreeToString::treeToStringInBugChecker;
  }

  @Override
  protected Optional<String> descriptionMessageForDefaultMatch(Type type, VisitorState state) {
    return Optional.of("Tree#toString shouldn't be used.");
  }

  @Override
  protected Optional<Fix> implicitToStringFix(ExpressionTree tree, VisitorState state) {
    return fix(tree, tree, state);
  }

  @Override
  protected Optional<Fix> toStringFix(Tree parent, ExpressionTree tree, VisitorState state) {
    if (!(parent instanceof MethodInvocationTree)) {
      return Optional.absent();
    }
    ExpressionTree receiver = getReceiver((ExpressionTree) parent);
    if (receiver == null) {
      return Optional.absent();
    }
    return fix(receiver, parent, state);
  }

  private static Optional<Fix> fix(Tree target, Tree replace, VisitorState state) {
    return Optional.fromJavaUtil(
        FindIdentifiers.findAllIdents(state).stream()
            .filter(
                s ->
                    isSubtype(
                        s.type,
                        state.getTypeFromString("com.google.errorprone.VisitorState"),
                        state))
            .findFirst()
            .map(
                s ->
                    SuggestedFix.replace(
                        replace,
                        String.format(
                            "%s.getSourceForNode(%s)", s, state.getSourceForNode(target)))));
  }
}
