Feature: Application Login

Scenario: Login with valid credentials

Given user is on landingPage
When  navigate to login page and enters "peterwilliams3@gmail.com" and "peterwilliams1"
And  user clicks on login button
Then  verify user is able to successfully login