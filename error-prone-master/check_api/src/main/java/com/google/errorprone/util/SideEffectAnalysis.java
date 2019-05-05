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

package com.google.errorprone.util;

import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.util.TreeScanner;
import com.sun.tools.javac.tree.JCTree.JCUnary;

/**
 * This class is responsible for analyzing an expression and telling if the expression can have side
 * effects. This class is used by calling the static {@link #hasSideEffect(ExpressionTree)} method.
 *
 * <p>A side-effect is what that would change the state of the program. Here are examples of
 * expressions that could possibly change the state of a program.
 *
 * <ul>
 *   <li>Any function call: toString(), hashCode(), setX(value), etc.
 *   <li>Unary expression: i += 1, i++, --j
 *   <li>New expression: new SomeClass()
 *   <li>New array: new int[10]
 * </ul>
 *
 * <p>Everything besides the above examples is considered side-effect free.
 *
 * <p>The analysis in this class initially assumes that the expression is side-effect free and then
 * tries to prove it wrong.
 */
public final class SideEffectAnalysis extends TreeScanner<Void, Void> {

  private boolean hasSideEffect = false;

  private SideEffectAnalysis() {}

  /**
   * Tries to establish whether {@code expression} is side-effect free. The heuristics here are very
   * conservative.
   */
  public static boolean hasSideEffect(ExpressionTree expression) {
    if (expression == null) {
      return false;
    }
    SideEffectAnalysis analyzer = new SideEffectAnalysis();
    expression.accept(analyzer, null);
    return analyzer.hasSideEffect;
  }

  @Override
  public Void visitCompoundAssignment(CompoundAssignmentTree tree, Void unused) {
    hasSideEffect = true;
    return null;
  }

  @Override
  public Void visitMethodInvocation(MethodInvocationTree tree, Void unused) {
    hasSideEffect = true;
    return null;
  }

  @Override
  public Void visitNewArray(NewArrayTree tree, Void unused) {
    hasSideEffect = true;
    return null;
  }

  @Override
  public Void visitNewClass(NewClassTree tree, Void unused) {
    hasSideEffect = true;
    return null;
  }

  @Override
  public Void visitUnary(UnaryTree tree, Void unused) {
    JCUnary unary = (JCUnary) tree;
    switch (unary.getKind()) {
      case PREFIX_DECREMENT:
      case PREFIX_INCREMENT:
      case POSTFIX_DECREMENT:
      case POSTFIX_INCREMENT:
        hasSideEffect = true;
        break;

      default:
        break;
    }
    return super.visitUnary(tree, unused);
  }
}
