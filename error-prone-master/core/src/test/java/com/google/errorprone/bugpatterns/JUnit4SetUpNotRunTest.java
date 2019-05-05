/*
 * Copyright 2014 The Error Prone Authors.
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

import com.google.errorprone.BugCheckerRefactoringTestHelper;
import com.google.errorprone.CompilationTestHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.JUnit4;
import org.junit.runners.ParentRunner;

/** @author glorioso@google.com (Nick Glorioso) */
@RunWith(JUnit4.class)
public class JUnit4SetUpNotRunTest {

  private CompilationTestHelper compilationHelper;
  private final BugCheckerRefactoringTestHelper refactoringTestHelper =
      BugCheckerRefactoringTestHelper.newInstance(new JUnit4SetUpNotRun(), getClass());

  @Before
  public void setUp() {
    compilationHelper = CompilationTestHelper.newInstance(JUnit4SetUpNotRun.class, getClass());
  }

  @Test
  public void testPositiveCases() {
    compilationHelper.addSourceFile("JUnit4SetUpNotRunPositiveCases.java").doTest();
  }

  @Test
  public void testPositiveCase_customBefore() {
    compilationHelper.addSourceFile("JUnit4SetUpNotRunPositiveCaseCustomBefore.java").doTest();
  }

  @Test
  public void customBefore_refactoring() {
    refactoringTestHelper
        .addInputLines("Before.java", "  @interface Before {}")
        .expectUnchanged()
        .addInputLines(
            "in/Foo.java",
            "import org.junit.runner.RunWith;",
            "import org.junit.runners.JUnit4;",
            "@RunWith(JUnit4.class)",
            "public class Foo {",
            "  @Before",
            "  public void initMocks() {}",
            "  @Before",
            "  protected void badVisibility() {}",
            "}")
        .addOutputLines(
            "out/Foo.java",
            "import org.junit.Before;",
            "import org.junit.runner.RunWith;",
            "import org.junit.runners.JUnit4;",
            "@RunWith(JUnit4.class)",
            "public class Foo {",
            "  @Before",
            "  public void initMocks() {}",
            "  @Before",
            "  public void badVisibility() {}",
            "}")
        .doTest();
  }

  @Test
  public void testPositiveCase_customBeforeDifferentName() {
    compilationHelper.addSourceFile("JUnit4SetUpNotRunPositiveCaseCustomBefore2.java").doTest();
  }

  @Test
  public void testNegativeCases() {
    compilationHelper.addSourceFile("JUnit4SetUpNotRunNegativeCases.java").doTest();
  }

  public abstract static class SuperTest {
    @Before
    public void setUp() {}
  }

  @Test
  public void noBeforeOnClasspath() {
    compilationHelper
        .addSourceLines(
            "Test.java",
            "import org.junit.runner.RunWith;",
            "import org.junit.runners.JUnit4;",
            "import " + SuperTest.class.getCanonicalName() + ";",
            "@RunWith(JUnit4.class)",
            "class Test extends SuperTest {",
            "  @Override public void setUp() {}",
            "}")
        .withClasspath(
            RunWith.class,
            JUnit4.class,
            BlockJUnit4ClassRunner.class,
            ParentRunner.class,
            SuperTest.class,
            SuperTest.class.getEnclosingClass())
        .doTest();
  }
}
