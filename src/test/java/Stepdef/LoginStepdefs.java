package Stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefs {
    @Given("^open the browser$")
    public void openTheBrowser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("open the browser");
    }

    @And("^enter the url$")
    public void enterTheUrl() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the url");
    }

    @And("^enter the credential$")
    public void enterTheCredential() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the credential");
    }

    @When("^user is  clicking in login button$")
    public void userIsClickingInLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is clicking in login button");
    }

    @Then("^user should be able to navigate homepage$")
    public void userShouldBeAbleToNavigateHomepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user should be able to navigate homepage");
    }

    @And("^enter the credential\"([^\"]*)\"<(\\d+)>$")
    public void enterTheCredential(String arg0, int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the credential");
    }

    @And("^enter the credential\"([^\"]*)\"> and \"([^\"]*)\"$")
    public void enterTheCredentialAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the credential");
    }

    @When("^user is  clicking in signup button$")
    public void userIsClickingInSignupButton() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.runtime.PendingException();
    }

    @When("^User is clicking on signup button$")
    public void userIsClickingOnSignupButton() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is clicking on signup button");
    }
}
