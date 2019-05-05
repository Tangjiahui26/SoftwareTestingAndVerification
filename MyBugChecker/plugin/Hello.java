/*
 * Negative and Positive Examples for group 8's custom bugchecker
 */

package com.google.errorprone.sample;

import java.util.Arrays;

public class Hello {
  public static void main() {
	  // run all negative examples which are the correct
	  // usage of if(true) or if(false)
	  negativeExample1();
	  negativeExample2();
	  negativeExample3();
	  negativeExample4();
	  negativeExample5();
	  
	  // run all positive examples which are the incorrect
	  // usage of if(true) or if(false)
	  positiveExample1();
	  positiveExample2();
	  positiveExample3();
	  positiveExample4();
	  positiveExample5();
	  positiveExample6();
	  positiveExample7();
  }
  
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
