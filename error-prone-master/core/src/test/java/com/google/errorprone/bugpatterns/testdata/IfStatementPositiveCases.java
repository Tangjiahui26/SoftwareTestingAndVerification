/*
 * CPEN522 - group 8
 */

package com.google.errorprone.bugpatterns.testdata;

import com.google.common.base.Objects;

public class IfStatementPositiveCases {
//  Positive Example 1: 
//  "if true" without a "then" statement
  public static void positiveExample1() {
	  if(true);
  }
  
//  Positive Example 2:
//  "if true" with an empty "then" statement
//  and an "Else" statement  
  public static void positiveExample2() {
	  if(true);
	   else {
		  return;
	  }
  }
  
//  Positive Example 3:
//  "if true" with an empty "then" statement 
//  and an empty "else" statement
  public static void positiveExample3() {
	  if(true);
	   else ;
  }
  
//  Positive Example 4:
//  "if true" with an empty "then" statement
//  and an "Else" statement without using brackets
  public static void positiveExample4() {
	  if(true) ;
	  else return;
  }
  
//  Positive Example 5:
//  "if false" with no "Then" and "Else" statements
  public static void positiveExample5() {
	  if(false);
  }
  
//  Positive Example 6:
//  "if false" with a "then" statement and 
//  An empty "Else" statement
  public static void positiveExample6() {
	  if(false) {
		  return;
	  } else ;
  }
  
//  Positive Example 7:
//  "if false" with empty "then" and "else" statments
  public static void positiveExample7() {
	  if(false) ;
	  else ;
  }
}
