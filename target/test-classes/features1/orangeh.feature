Feature: checking the functionality of OrangeHRM Login


Scenario Outline: Login with valid and invalid credentials
    Given user is on loginPage
    When user enters "username" and "password" in the field
    And user clicks on login button
    Then user should be able to successfully loged in based on <expected> result
    

  Examples: 
      | username | password | expected |
      | Admin    | admin123 | success  |
      | peter    | williams | Fail     |
      | Admin    | admin123 | success  |