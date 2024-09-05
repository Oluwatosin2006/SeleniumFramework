Feature: checking the functionality of OrangeHRM Login application

  Background: Login functionality
    Given user is on login page
    When user enters "Admin" and "admin123"
    And user click login button
    Then user navigate to dashboard page

  Scenario: check the Admin tap functionality
    And user click on Admin button
    Then user navigate to management page

  Scenario: check the PIM tap functionality
    And user click on PIM button
    Then user navigate to employee page

