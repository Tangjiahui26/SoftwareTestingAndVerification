# My Bug - Pattern
Here we would like to describe our bug checker: IfStatementChecker.

The basic idea is to *detect the usage of if(true) and if(false)*. Even though in real life, those kind of code is not that common, in our assumption, we think it is possible to have those patterns. 

Initially, our motivation is to detect a if statement is always true or false, but it turned out we need to "solver" the condition just like constraint solver of symbolic execution, which is hard for us to realize, so we simplified our idea into testing "if(true)" and "if(false)".

Below are our **basic rules** for our bug checker:
- If a if statement is "if(true)", then the "then" statement shall not be null or empty;
- If a if statement is "if(false)", then the "Else" statement shall not be null or empty;

By empty statement, according to existing definition of EmptyStatement in Error-Prone, it means statement like `;`.

# My Bug - Positive Examples:

We provided some examples for our bug checker. For the positive example, which means the incorrect usage of "if(true)" or "if(false)", we provided seven cases:

*Positive Examples:*
```Java
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
//"if false" with no "Then" and "Else" statements
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
//"if false" with empty "then" and "else" statments
  public static void positiveExample7() {
	  if(false) ;
	  else ;
  }
  ```
  
  # My Bug - Negative Examples:
  
  Similarly, for negative examples, we provided five cases:
  
  *Negative Examples:*
  ```Java
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
//"if true" with a "then" statement 
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
//"if false" with both "then" and "else" statements
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
  ```
