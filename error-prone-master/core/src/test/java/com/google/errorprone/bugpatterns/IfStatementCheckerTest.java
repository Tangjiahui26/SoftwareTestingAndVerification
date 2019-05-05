/*
 * CPEN522 - group 8
 */

package com.google.errorprone.bugpatterns;

import com.google.errorprone.CompilationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class IfStatementCheckerTest {
  CompilationTestHelper compilationHelper;

  // since we did not provide a SuggestedFixes, so it is expected to be errors
  @Test (expected = AssertionError.class)
  public void testIfStatementPositiveCases() {
	compilationHelper = CompilationTestHelper.newInstance(IfStatementChecker.class, getClass());
    compilationHelper.addSourceFile("IfStatementPositiveCases.java").doTest();
  }

  @Test
  public void testIfStatementNegativeCases() {
	compilationHelper = CompilationTestHelper.newInstance(IfStatementChecker.class, getClass());
    compilationHelper.addSourceFile("IfStatementNegativeCases.java").doTest();
  }
}
