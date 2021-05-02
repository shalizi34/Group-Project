#Author: your.shalizi@your.domain.com

Feature: Employee skills 

Scenario: user navigate to HRMS and add employee skills 
Given user should logged with valid admin credentials 
When user navigate to PIM and click on employee list 
Then admin find employee by ID "13389" and click on it
And the employee "Farid Aryob" is displayed 
And admin is navigated to qualifications 
Then user click on add  skills
