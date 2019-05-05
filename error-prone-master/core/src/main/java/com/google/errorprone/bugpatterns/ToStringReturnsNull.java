/*
 * Copyright 2016 The Error Prone Authors.
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

import static com.google.errorprone.BugPattern.SeverityLevel.WARNING;
import static com.sun.source.tree.Tree.Kind.NULL_LITERAL;

import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker.MethodTreeMatcher;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matchers;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.util.TreeScanner;

/**
 * ToString should not return null.
 *
 * @author eleanorh@google.com (Eleanor Harris)
 * @author siyuanl@google.com (Siyuan Liu)
 */
@BugPattern(
    name = "ToStringReturnsNull",
    summary = "An implementation of Object.toString() should never return null.",
    severity = WARNING)
public class ToStringReturnsNull extends BugChecker implements MethodTreeMatcher {

  @Override
  public Description matchMethod(MethodTree tree, VisitorState state) {

    if (!Matchers.toStringMethodDeclaration().matches(tree, state)) {
      return Description.NO_MATCH;
    }

    boolean hasReturnNull =
        tree.accept(
            new TreeScanner<Boolean, Void>() {
              @Override
              public Boolean visitLambdaExpression(LambdaExpressionTree node, Void unused) {
                return false;
              }

              @Override
              public Boolean visitClass(ClassTree node, Void unused) {
                return false;
              }

              @Override
              public Boolean visitReturn(ReturnTree node, Void unused) {
                return node.getExpression().getKind() == NULL_LITERAL;
              }

              @Override
              public Boolean reduce(Boolean r1, Boolean r2) {
                return (r1 != null && r1) || (r2 != null && r2);
              }
            },
            null);

    return hasReturnNull ? describeMatch(tree) : Description.NO_MATCH;
  }
}
