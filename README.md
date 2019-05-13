# CucumberSelenium
eBayAutomation

selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. 
It is cross-platform, open source and free. Automate your test cases with minimal coding
    
Pre-requisites
Java
Maven
Eclipse
Eclipse Plugins
Maven
Cucumber
Setting up selenium-cucumber-java
Install Java and set path.
Install Maven and set path.


Running features
Goto project directory.

1) Eclipse
   Run As Junit of Test Runner from eclipse

2) Command Prompt

Use mvn test -Dcucumber.options="/Cucumber/Feautures/search.feature" to run specific feature if you have multiple feature files.

Use mvn test -Dcucumber.options="–-plugin html:target/result-html" to generate a HTML report.

Use mvn test -Dcucumber.options="–-plugin json:target/result-json" to generate a JSON report.


