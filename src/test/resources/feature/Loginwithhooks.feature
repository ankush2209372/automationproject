@test
Feature: Login page
  Scenario: validate user should able to login with valid credential
    And enter the url
    And enter the credential
    When user is  clicking in login button
    Then user should be able to navigate homepage
