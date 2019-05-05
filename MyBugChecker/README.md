# My Bug Checker - Usage Instruction

To use our bug checker, there are two options:

1. Since we added our bug checker as part of the source code of Error-Prone, so the user should be able to install it and generate a new JAR, then use commandline to invoke javac with error prone argument. [The official website of Error Prone](https://errorprone.info/docs/installation) provides more information about how to run it in commandline.

2. More easily, the alternative is to use it as a plugin. We already copied our code into the plugin folder and Error Prone has already set all the maven configurations, so we can simply run `maven install` then the code in `Hello.java` will be checked using error-prone.

![plugin_result](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/plugin_result.png)

As shown above, our bug checker is able to detect all 7 positive cases in the code. For the other 5 negative cases, they are not reported. 

# My Bug Checker - Others

More details about our bug checker can be found here:

- Bug Pattern and Examples:
  + [MyBug.md](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/MyBug.md)

- Bug Checker Workflow:
  + [MyAnalyzer.md](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/MyAnalyzer.md)
  
- Bug Checker Code:
  + Error Prone Core:
    - BugChecker: [IfStatementChecker.java](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/IfStatementChecker.java)
    - BugChecker Test Class: [IfStatementCheckerTest.java](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/IfStatementCheckerTest.java)
    - BugChecker Nagetive Examples: [IfStatementNegativeCases.java](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/IfStatementNegativeCases.java)
    - BugChecker Positive Examples: [IfStatementPositiveCases.java](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/IfStatementPositiveCases.java)
  + Plugin (same code with examples):
    - BugChecker: [MyCustomCheck.java](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/plugin/MyCustomCheck.java)
    - Example Program: [Hello.java](https://github.com/UBC-TestingCourse/group8/blob/master/MyBugChecker/plugin/Hello.java)
