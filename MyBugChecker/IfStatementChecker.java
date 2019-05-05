/*
 * Group 8's custom bugchecker for CPEN522
 */

package com.google.errorprone.bugpatterns;

import static com.google.errorprone.matchers.Matchers.nextStatement;
import static com.google.errorprone.matchers.Matchers.parentNode;
import static com.sun.source.tree.Tree.Kind.IF;
import static com.sun.source.tree.Tree.Kind.PARENTHESIZED;
import static com.sun.source.tree.Tree.Kind.BOOLEAN_LITERAL;


import static com.google.errorprone.BugPattern.SeverityLevel.ERROR;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.BugPattern.ProvidesFix;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker.EmptyStatementTreeMatcher;
import com.google.errorprone.fixes.SuggestedFix;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matchers;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.StatementTree;
import com.sun.source.tree.Tree;
import com.google.errorprone.bugpatterns.BugChecker;

@BugPattern(
	    name = "IfStatementChecker",
	    altNames = {"ifstatement"},
	    summary = "If statement is always true or false",
	    severity = ERROR)

public class IfStatementChecker extends BugChecker implements EmptyStatementTreeMatcher {
  /**
   * This is a custom bugchecker wrote for CPEN522
   * The basic idea is to detect the usage of if(true)
   * and if(false). 
   * 
   * If the if statement is "if(true)", then 
   * the "then statement" should not be null or empty;
   * 
   * if the if statement is "if(false)", then
   * the "Else statement" should not be null or empty;
   * 
   */
  @Override
  public Description matchEmptyStatement(EmptyStatementTree tree, VisitorState state) {
    boolean matches = false;
    Tree parent = state.getPath().getParentPath().getLeaf();
    if (parent.getKind() == IF) {
      IfTree parentAsIf = (IfTree) parent;
      if (parentAsIf.getCondition().getKind() == PARENTHESIZED){
    	  	  ParenthesizedTree test = (ParenthesizedTree) (parentAsIf.getCondition());
    	  	  if(test.getExpression().getKind() == BOOLEAN_LITERAL) {
    	  		LiteralTree test_boolean = (LiteralTree) (test.getExpression());
    	  		if(test_boolean.getValue().toString() == "true") {
    	  			matches = 
    	  					((parentAsIf.getElseStatement() != null) && !(parentAsIf.getElseStatement() instanceof EmptyStatementTree)) || 
//    	  				  		((parentAsIf.getThenStatement() == null) ||
			  				 (parentAsIf.getThenStatement() instanceof EmptyStatementTree);
    	  		} else if (test_boolean.getValue().toString() == "false") {
    	  			 matches = 
//    	  					 ((parentAsIf.getThenStatement() != null) || !(parentAsIf.getThenStatement() instanceof EmptyStatementTree)) ||
     	  				   (parentAsIf.getElseStatement() == null) || (parentAsIf.getElseStatement() instanceof EmptyStatementTree);
    	  		}
    	  	  }
      }
    }
    if (!matches) {
      return Description.NO_MATCH;
    }
    assert (state.getPath().getParentPath().getLeaf().getKind() == IF);
    IfTree ifParent = (IfTree) state.getPath().getParentPath().getLeaf();
    return describeMatch(ifParent);
  }
}
