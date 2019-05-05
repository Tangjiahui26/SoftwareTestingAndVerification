/*
 * Copyright 2015 The Error Prone Authors.
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

package com.google.errorprone.bugpatterns.android;

import static com.google.errorprone.BugPattern.SeverityLevel.ERROR;
import static com.google.errorprone.matchers.Matchers.instanceMethod;

import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.AbstractReturnValueIgnored;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matcher;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.MethodInvocationTree;

/** @author avenet@google.com (Arnaud J. Venet) */
@BugPattern(
    name = "RectIntersectReturnValueIgnored",
    summary = "Return value of android.graphics.Rect.intersect() must be checked",
    severity = ERROR)
public final class RectIntersectReturnValueIgnored extends AbstractReturnValueIgnored {
  @Override
  public Matcher<? super ExpressionTree> specializedMatcher() {
    return instanceMethod().onExactClass("android.graphics.Rect").named("intersect");
  }

  @Override
  public Description describe(MethodInvocationTree methodInvocationTree, VisitorState state) {
    return describeMatch(methodInvocationTree);
  }
}
