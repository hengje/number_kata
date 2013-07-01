kata-template-java
==================

A template for new katas in Java. Use to get new project up and running quickly 
when starting new Katas.

How to get started
------------------
1. Fork this repo and give it a new name appropriate for the kata.
2. Change the name in the pom file so you get a name appropriate for the kata.
3. Open the pom in your favorite IDE. The IDE must be able to read or import pom files...
4. Start coding. You can use the existing Example-classes as a simple example to get started.
5. Remove the example classes and tests when no longer needed.

Assertion frameworks
--------------------
The example test gives examples of 3 different ways to write assertions. Choose your favorite...
* Standard jUnit assertions
* Hamcrest assertions
* Fest Fluent Assertions

The example is actually too simple to display the advantages of the best (in my opinion)
framework, try out the different ways to write assertions and find out for yourself... 

Reports
-------
The project has a lot of reports configured. It will probably be a good idea to generate and 
look at the reports *after* the kata.

Run 'mvn site' to genereate the reports.

* PIT. Pit is a mutation testing framework and will tell you something about
  the *quality* of your tests. Open 'target/pit-reports/index.html' in a browser.
* Maven reports (PMD, CPD, Checkstyle, FindBugs and more). Open 'target/site/index.html' in a browser.

