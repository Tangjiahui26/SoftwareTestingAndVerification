/*
 * CPEN 522 - group 8
 */

package com.google.errorprone.bugpatterns.testdata;

import com.google.common.base.Objects;

public class IfStatementNegativeCases {
//  Negative Example 1:
//  "if true" with both "then" and "else" statments
  public static void negativeExample1() {
	  if(true) {
		  return;
	  } else {
		  return;
	  }
  }
  
//  Negative Example 2:
//  "if true" with a "then" statement 
  public static void negativeExample2() {
	  if(true) {
		  return;
	  }
  }

//  Negative Example 3:
//  "if true" with a "then" statement and an empty "else"
  public static void negativeExample3() {
	  if(true) {
		  return;
	  } else ;
  }

//  Negative Example 4:
//  "if false" with both "then" and "else" statements
  public static void negativeExample4() {
	  if(false) {
		  return;
	  } else {
		  return;
	  }
  }
  
//  Negative Example 5:
//  "if false" with an empty "then" and an "Else" statement
  public static void negativeExample5() {
	  if(false);
	  else {
		  return;
	  }
  }
}
