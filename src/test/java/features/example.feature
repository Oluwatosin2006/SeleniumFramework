Feature: Application Login

Scenario Outline: Login with valid and invalid credentials

Given User is on landPage
When  user navigate to login page and enters Username as <someusername> and Password as <somepassword> into the fields
And  user clicks on the button
Then  user should be able to log based on "<expected>" login status

Examples: 
      | someusername            | somepassword  | expected  |
      | peterwilliams3@gmail.com| peterwilliams1| success   |
      | john@gmail.com          | test@123      | Fail      |
      | abc@gmail.com           | test123       | success   |
    