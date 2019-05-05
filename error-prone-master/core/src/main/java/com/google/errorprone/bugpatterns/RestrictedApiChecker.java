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

import com.google.errorprone.BugPattern;
import com.google.errorprone.BugPattern.ProvidesFix;
import com.google.errorprone.BugPattern.SeverityLevel;
import com.google.errorprone.VisitorState;
import com.google.errorprone.annotations.RestrictedApi;
import com.google.errorprone.bugpatterns.BugChecker.AnnotationTreeMatcher;
import com.google.errorprone.bugpatterns.BugChecker.MethodInvocationTreeMatcher;
import com.google.errorprone.bugpatterns.BugChecker.NewClassTreeMatcher;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matcher;
import com.google.errorprone.matchers.Matchers;
import com.google.errorprone.util.ASTHelpers;
import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Symbol.MethodSymbol;
import com.sun.tools.javac.tree.JCTree.JCCompilationUnit;
import java.util.Optional;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.type.MirroredTypesException;

/** Check for non-whitelisted callers to RestrictedApiChecker. */
@BugPattern(
    name = "RestrictedApiChecker",
    summary = " Check for non-whitelisted callers to RestrictedApiChecker.",
    severity = SeverityLevel.ERROR,
    suppressionAnnotations = {},
    disableable = false,
    providesFix = ProvidesFix.REQUIRES_HUMAN_ATTENTION)
public class RestrictedApiChecker extends BugChecker
    implements MethodInvocationTreeMatcher, NewClassTreeMatcher, AnnotationTreeMatcher {

  /**
   * Validates a {@code @RestrictedApi} annotation and that the declared restriction makes sense.
   *
   * <p>The other match functions in this class check the <em>usages</em> of a restricted API.
   */
  @Override
  public Description matchAnnotation(AnnotationTree tree, VisitorState state) {
    // TODO(bangert): Validate all the fields
    if (!ASTHelpers.getSymbol(tree).toString().equals(RestrictedApi.class.getName())) {
      return Description.NO_MATCH;
    }
    // TODO(bangert): make a more elegant API to get the annotation within an annotation tree.
    // Maybe find the declared object and get annotations on that...
    AnnotationMirror restrictedApi = ASTHelpers.getAnnotationMirror(tree);
    if (restrictedApi == null) {
      return Description.NO_MATCH;
    }
    return Description.NO_MATCH;
  }

  @Override
  public Description matchMethodInvocation(MethodInvocationTree tree, VisitorState state) {
    RestrictedApi annotation = ASTHelpers.getAnnotation(tree, RestrictedApi.class);
    if (annotation != null) {
      return checkRestriction(annotation, tree, state);
    }

    MethodSymbol methSymbol = ASTHelpers.getSymbol(tree);
    if (methSymbol == null) {
      return Description.NO_MATCH; // This shouldn't happen, but has. (See b/33758055)
    }

    // Try each super method for @RestrictedApi
    Optional<MethodSymbol> superWithRestrictedApi =
        ASTHelpers.findSuperMethods(methSymbol, state.getTypes()).stream()
            .filter((t) -> ASTHelpers.hasAnnotation(t, RestrictedApi.class, state))
            .findFirst();
    if (!superWithRestrictedApi.isPresent()) {
      return Description.NO_MATCH;
    }
    return checkRestriction(
        ASTHelpers.getAnnotation(superWithRestrictedApi.get(), RestrictedApi.class), tree, state);
  }

  @Override
  public Description matchNewClass(NewClassTree tree, VisitorState state) {
    return checkRestriction(ASTHelpers.getAnnotation(tree, RestrictedApi.class), tree, state);
  }

  private Description checkRestriction(
      @Nullable RestrictedApi restriction, Tree where, VisitorState state) {
    if (restriction == null) {
      return Description.NO_MATCH;
    }
    if (!restriction.allowedOnPath().isEmpty()) {
      JCCompilationUnit compilationUnit = (JCCompilationUnit) state.getPath().getCompilationUnit();
      String path = ASTHelpers.getFileName(compilationUnit);
      if (Pattern.matches(restriction.allowedOnPath(), path)) {
        return Description.NO_MATCH;
      }
    }
    boolean warn =
        Matchers.enclosingNode(shouldAllowWithWarning(restriction)).matches(where, state);

    boolean allow = Matchers.enclosingNode(shouldAllow(restriction)).matches(where, state);
    if (warn && allow) {
      // TODO(bangert): Clarify this message if possible.
      return buildDescription(where)
          .setMessage(
              "The Restricted API (["
                  + restriction.checkerName()
                  + "]"
                  + restriction.explanation()
                  + ") call here is both whitelisted-as-warning and "
                  + "silently whitelisted. "
                  + "Please remove one of the conflicting suppression annotations.")
          .build();
    }
    if (allow) {
      return Description.NO_MATCH;
    }
    SeverityLevel level = warn ? SeverityLevel.WARNING : SeverityLevel.ERROR;

    Description.Builder description =
        Description.builder(
            where, restriction.checkerName(), restriction.link(), level, restriction.explanation());
    return description.build();
  }

  // TODO(bangert): Memoize these if necessary.
  private static Matcher<Tree> shouldAllow(RestrictedApi api) {
    try {
      return Matchers.hasAnyAnnotation(api.whitelistAnnotations());
    } catch (MirroredTypesException e) {
      return Matchers.hasAnyAnnotation(e.getTypeMirrors());
    }
  }

  private static Matcher<Tree> shouldAllowWithWarning(RestrictedApi api) {
    try {
      return Matchers.hasAnyAnnotation(api.whitelistWithWarningAnnotations());
    } catch (MirroredTypesException e) {
      return Matchers.hasAnyAnnotation(e.getTypeMirrors());
    }
  }
}
