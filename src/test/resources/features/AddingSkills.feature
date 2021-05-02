#Author: shalizi@your.domain.com
Feature: Skill in Qualifications

  Scenario: add different skills in qualifications
    Given user is navigated to HRMS with valid admin credentials
    And click skills under qualification button
    Then click add button and add skills "<Name>", "<Description>"
    
      | Name     | Description                   |
      | PMP      | The employee is PMP certified |
      | Creative | Creative skills               |
