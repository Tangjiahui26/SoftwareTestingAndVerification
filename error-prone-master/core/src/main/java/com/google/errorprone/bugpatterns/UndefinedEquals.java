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

import static com.google.common.collect.Iterables.getLast;
import static com.google.common.collect.Iterables.getOnlyElement;
import static com.google.errorprone.BugPattern.SeverityLevel.WARNING;
import static com.google.errorprone.matchers.Matchers.allOf;
import static com.google.errorprone.matchers.Matchers.anyOf;
import static com.google.errorprone.matchers.Matchers.assertEqualsInvocation;
import static com.google.errorprone.matchers.Matchers.assertNotEqualsInvocation;
import static com.google.errorprone.matchers.Matchers.instanceEqualsInvocation;
import static com.google.errorprone.matchers.Matchers.receiverOfInvocation;
import static com.google.errorprone.matchers.Matchers.staticEqualsInvocation;
import static com.google.errorprone.matchers.Matchers.staticMethod;
import static com.google.errorprone.matchers.method.MethodMatchers.instanceMethod;
import static com.google.errorprone.util.ASTHelpers.getReceiver;
import static com.google.errorprone.util.ASTHelpers.getType;
import static com.google.errorprone.util.ASTHelpers.isSameType;

import com.google.common.collect.ImmutableSet;
import com.google.errorprone.BugPattern;
import com.google.errorprone.BugPattern.ProvidesFix;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker.MethodInvocationTreeMatcher;
import com.google.errorprone.fixes.SuggestedFix;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matcher;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Flags types which do not have well-defined equals behavior.
 *
 * @author eleanorh@google.com (Eleanor Harris)
 */
@BugPattern(
    name = "UndefinedEquals",
    summary = "This type is not guaranteed to implement a useful #equals method.",
    severity = WARNING,
    providesFix = ProvidesFix.REQUIRES_HUMAN_ATTENTION)
public final class UndefinedEquals extends BugChecker implements MethodInvocationTreeMatcher {

  private static final Matcher<MethodInvocationTree> ASSERT_THAT_EQUALS =
      allOf(
          instanceMethod()
              .onDescendantOf("com.google.common.truth.Subject")
              .namedAnyOf("isEqualTo", "isNotEqualTo"),
          receiverOfInvocation(
              anyOf(
                  staticMethod().onClass("com.google.common.truth.Truth").named("assertThat"),
                  instanceMethod()
                      .onDescendantOf("com.google.common.truth.StandardSubjectBuilder")
                      .named("that"))));

  @Override
  public Description matchMethodInvocation(MethodInvocationTree tree, VisitorState state) {
    Tree receiver;
    Tree argument;
    List<? extends ExpressionTree> arguments = tree.getArguments();

    if (staticEqualsInvocation().matches(tree, state)
        || assertEqualsInvocation().matches(tree, state)
        || assertNotEqualsInvocation().matches(tree, state)) {
      receiver = arguments.get(arguments.size() - 2);
      argument = getLast(arguments);
    } else if (instanceEqualsInvocation().matches(tree, state)) {
      receiver = getReceiver(tree);
      argument = arguments.get(0);
    } else if (ASSERT_THAT_EQUALS.matches(tree, state)) {
      receiver = getOnlyElement(arguments);
      argument = getOnlyElement(((MethodInvocationTree) getReceiver(tree)).getArguments());
    } else {
      return Description.NO_MATCH;
    }

    return Arrays.stream(BadClass.values())
        .filter(
            b -> b.matchesType(getType(receiver), state) || b.matchesType(getType(argument), state))
        .findFirst()
        .map(
            b ->
                buildDescription(tree)
                    .setMessage(b.shortName() + " does not have well-defined equals behavior.")
                    .addFix(b.generateFix(receiver, argument, state))
                    .build())
        .orElse(Description.NO_MATCH);
  }

  private enum BadClass {
    LONG_SPARSE_ARRAY(
        "LongSparseArray",
        "android.util.LongSparseArray",
        "android.support.v4.util.LongSparseArrayCompat",
        "androidx.collection.LongSparseArrayCompat") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        return Optional.empty();
      }
    },
    SPARSE_ARRAY(
        "SparseArray",
        "android.util.SparseArray",
        "android.support.v4.util.SparseArrayCompat",
        "androidx.collection.SparseArrayCompat") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        return Optional.empty();
      }
    },
    MULTIMAP("Multimap", "com.google.common.collect.Multimap") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        return Optional.empty();
      }
    },
    CHAR_SEQUENCE("CharSequence", "java.lang.CharSequence") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        Type charSequence = state.getTypeFromString(getOnlyElement(CHAR_SEQUENCE.typeNames));
        if (isSameType(getType(receiver), charSequence, state)
            && isSameType(getType(argument), state.getSymtab().stringType, state)) {
          return Optional.of(SuggestedFix.postfixWith(receiver, ".toString()"));
        }
        if (isSameType(getType(argument), charSequence, state)
            && isSameType(getType(receiver), state.getSymtab().stringType, state)) {
          return Optional.of(SuggestedFix.postfixWith(argument, ".toString()"));
        }
        return Optional.empty();
      }
    },
    ITERABLE("Iterable", "java.lang.Iterable") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        return Optional.empty();
      }
    },
    COLLECTION("Collection", "java.util.Collection") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        return Optional.empty();
      }
    },
    QUEUE("Queue", "java.util.Queue") {
      @Override
      Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state) {
        return Optional.empty();
      }
    };

    private final String shortName;
    private final ImmutableSet<String> typeNames;

    BadClass(String shortName, String... typeNames) {
      this.shortName = shortName;
      this.typeNames = ImmutableSet.copyOf(typeNames);
    }

    abstract Optional<SuggestedFix> generateFix(Tree receiver, Tree argument, VisitorState state);

    private boolean matchesType(Type type, VisitorState state) {
      return typeNames.stream()
          .anyMatch(typeName -> isSameType(type, state.getTypeFromString(typeName), state));
    }

    private String shortName() {
      return shortName;
    }
  }
}
