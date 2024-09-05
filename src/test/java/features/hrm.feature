Feature: checking the functionality of OrangeHRM Login


Scenario Outline: Login with valid and invalid credentials
    Given user is on loginPage
    When user enters Username as <username> and Password as <password> in the field
    And user clicks on the login button

    

  Examples: 
      | username | password | expected |
      | Admin    | admin123 | success  |
      | peter    | williams | Fail     |
      | Admin    | admin123 | success  | 