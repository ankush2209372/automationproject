@background
Feature: end to end testing journey
  Background: Login with valid credentials
    Given click on the login tab
    Given enter the username and the password
    Given Click on SignIn  button
@sun
Scenario Outline: validate title
      Given click on catalog tab
      Then Select the product to purchase
      Then click on the add to cart buttton
      Then validate the numbering on clicking on add to cart button "<numbering>"
      When click on the checkout button
      Then Validate the title of checkout page "<expectedCheckoutPageTitle>"
      When user is clicking on checkout button
      Then validate the title of contact detail and payment detail "<expectedPaymentDetailPageTitle>"
      Then user is entering contact detail and payment detail
      And click on paynow button
    Examples:
      |expectedTitle|numbering|expectedCheckoutPageTitle|expectedPaymentDetailPageTitle|


