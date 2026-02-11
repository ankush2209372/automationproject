Feature: signup

  Scenario : validate user should able to login with valid credential
    Given open the browser
    And enter the url
    And enter the credential
    When user is  clicking in signup button
    Then user should be able to Signup button
    And enter the valid name
    And enter the valid confirm password
    Then  User should be able to signup successfully

    Scenario: Validate error message when all field are blank
      Given open the browser
      And click on signup link
      When User is clicking on signup button
      Then user should see error message for mandatory field

  Scenario: Validate Error message when email is blank
    Given open the browser
    And Enter the url
    And click on signup link
    And Enter the valid name
    And enter the valid password
    And enter valid confirm password
    When user is clicking on signup button
    Then User should see error message for email field

    Scenario: Validate password and confirm password is mismatch
      Given open the browser
      And enter the url
      And click on Signup link
      And enter the valid name
      And enter the password
      And enter different confirm password
      And enter different confirm password
      When User is clicking on Signup button
      Then user should see password mismatch password

      Scenario: Validate email already exists
        Given open the browser
        And user is  clicking in Signup link
        And enter valid name
        And enter existing email
        And enter valid password
        And enter the confirm password
        When user is  clicking in Signup button
        Then user should see email already registered message

  Scenario : Validate signup button is enabled when fields are valid
    Given Open the Browser
    And enter the URL
    And click on Signup link
    And enter valid details
    Then Signup button should be enabled

  Scenario : Validate spaces are not allowed in mandatory fields
    Given Open the Browser
    And enter the URL
    And click on Signup link
    And enter spaces in name field
    And enter spaces in email field
    When User is clicking on Signup button
    Then User should see validation message

  Scenario: Validate signup button is disabled when fields are empty
    Given Open the Browser
    And enter the URL
    And click on Signup link
    Then Signup button should be disabled

  Scenario: Validate signup button is enabled when fields are valid
    Given Open the Browser
    And enter the URL
    And click on Signup link
    And enter valid details
    Then Signup button should be enabled

  Scenario: Validate confirmation email is sent
    Given User completed signup successfully
    Then User should receive confirmation email





