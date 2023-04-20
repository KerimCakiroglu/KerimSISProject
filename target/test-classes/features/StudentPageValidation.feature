#Author: Kerim

@studentSubTabs
Feature: Student Page Sub Tabs Validation
 

  Scenario: Student Page Sub Tabs Validation
    Given Login as Admin
    When Click Student Tab
    Then I validate the sub-tabs
      | Personal             |
      | Parental             |
      | Academic             |
      | Override Final Grade |
      | Schedule             |
      | Discipline Stats     |
      | Personal 2           |
      | Enrollment           |
      | Notes                |
      | E-Portfolio          |
      | Program Enrollment   |
    Then Quit browser
    

 
