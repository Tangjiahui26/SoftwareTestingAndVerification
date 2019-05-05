# My Analyzer - Why choosing Error Prone?

For this assignment, we need to create our own bugchecker using static analysis frameworks. In our case, we chose to use ErrorProne, based on those reasons:

- It is a state-of-art static analysis tool for JAVA built on top of the javac JAVA compiler.
- The custom bugchecker is using JAVA language which is the language we are familiar with.
- Error-Prone keeps updating. A lot of developers make contributions to the bugcheckers.
- The static analysis is based on JAVA APIs like _com.sun.source.tree.*_, which are well-documented.

# My Analyzer - WorkFlow of IfStatementChecker

Below are our **basic rules** for our bug checker:

- If a if statement is "if(true)", then the "then" statement shall not be null or empty;
- If a if statement is "if(false)", then the "Else" statement shall not be null or empty;

Based on our idea, we created our own bug checker which is called IfStatmentChecker. Here is the workflow of our bugchecker:

1. If the kind of a statement is **IF**, which means it is a **IfTree**, then go step 2, otherwise visit next statement;
2. Get the condition of the IfTree, if the kind of the condition is **PARENTHESIZED**, then go step 3, otherwise return and visit next statements;
3. Get the expression of the result from step 2, if it is **BOOLEAN\_LITERAL** type, then go step 4, otherwise return and visit the next statement;
4. Get the value of the result from step 3, if it is **"true"**, use **Rule 1** to detect if it is a match; if it is **"false"**, use **Rule 2** to detect if it is a match.

If there is no match, our bug checker will report nothing. On the other hand, if a match is found, our bug checker will report the corresponding "if" statement.
