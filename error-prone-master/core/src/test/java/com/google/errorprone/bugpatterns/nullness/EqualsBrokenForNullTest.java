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

package com.google.errorprone.bugpatterns.nullness;

import com.google.errorprone.CompilationTestHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** @author bhagwani@google.com (Sumit Bhagwani) */
@RunWith(JUnit4.class)
public class EqualsBrokenForNullTest {

  private CompilationTestHelper compilationHelper;

  @Before
  public void setUp() {
    compilationHelper = CompilationTestHelper.newInstance(EqualsBrokenForNull.class, getClass());
  }

  @Test
  public void testPositiveCase() {
    compilationHelper.addSourceFile("EqualsBrokenForNullPositiveCases.java").doTest();
  }

  @Test
  public void testNegativeCase() {
    compilationHelper.addSourceFile("EqualsBrokenForNullNegativeCases.java").doTest();
  }

  @Test
  public void negativeGenerics() {
    compilationHelper
        .addSourceLines(
            "Test.java",
            "class Test<A, B> {",
            "  A a;",
            "  B b;",
            "  public boolean equals(Object other) {",
            "    if (!(other instanceof Test<?, ?>)) {",
            "      return false;",
            "    }",
            "    Test<?, ?> that = (Test<?, ?>) other;",
            "    return a.equals(that.a) && b.equals(that.b);",
            "  }",
            "}")
        .doTest();
  }
}
