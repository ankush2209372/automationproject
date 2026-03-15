@login
@test
Feature: Login page
 Scenario: validate user should able to login with valid credential
   Given open the browser
   And enter the url
   And enter the credential
   When user is  clicking in login button
   Then user should be able to navigate homepage
   And close the browser

 Scenario: validate user should able to login with valid credential
  Given open the browser
  And  enter the url
  And enter the credential"<Ankush> and "<12345>
  When user is  clicking in login button
  Then user should be able to navigate homepage
  And close the browser

 Scenario Outline: validate user should able to login with valid credential
  Given open the browser
  And  enter the url
  And enter the credential"<username "> and "<Password>"
  When user is  clicking in login button
  Then user should be able to navigate homepage
  And close the browser
  Examples:
   |username| password|
   |ankush|12345|

