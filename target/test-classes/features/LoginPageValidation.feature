#Author: Kerim

@login
Feature: Successful Login and Homepage Validation
 

  Scenario: Login Page Validation
    Given Go to Neotech Academy Management System LoginPage
    When Write username as Admin
    And Write password as Admin
    And click login button.
    Then validate succesfully entry.
    Then Quit browser
    

 
