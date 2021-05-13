# Innosabi E2E


## Automation test regression suite for Innosabi E2e

### The below functionalities covered in testcases.

* Creating new idea
	* Creates new idea with idea title and idea description
	* Checks if idea created successfully by retrieving latest idea and verifying data
* Commenting on the existing idea
	* adds comment on latest idea created
	* verifies if comment added uccesfully by retrieving comment and comparing data

* Page Object model with page factory design pattern followed for the actions to be performed on each page

### Tools and Technologies used

* Java (1.8 or higher)
* TestNG
* Selenium (3.141.59)
* Chrome Browser (Version 90.0.4430.93 (Official Build) (64-bit))
* Maven
* Extent Report

### Configuration/setup to be done to run the project

* The below details are configured in config.properies file(available in innosabie2e\src\main\java\com\innosabi\e2e\config\config.properties)
	* url = https://e2e.innosabi.com/
	* email = "enter email id here"
	* password = "enter password here"

* TestBase class (com.innosabi.e2e.base package) is base class for all tests and it provides configurations like url, email, password and browser details
* All test classes (com.innosabi.e2e.tests package) extends TestBase class to inherit base configuration data.


### To Run Tests
* testng.xml file is configured with tests and extent reports
* run the tests by executing the testng.xml file as testng suite
* after tests run, open report under test-output/TestReport.html to see interactive HTML report on test execution status.


