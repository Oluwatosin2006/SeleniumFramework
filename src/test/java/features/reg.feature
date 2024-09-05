Feature: Test the functionality of the register details field

  Scenario: Register new customer credentials
    Given user is on landing page
    When user navigate to registerpage and enters new customer details using DataTable
      | firstName | Peter                   |
      | lastName  | Williams                |
      | email     | peterwilliam3@gmail.com |
      | telephone |                 2314567 |
      | password  | peter123                |
    And user selects the privacy policy option
    And clicks on reg continue button
    Then user should be able to successfully register
