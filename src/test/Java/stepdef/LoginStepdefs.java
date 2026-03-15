package stepdef;


import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepdefs extends TestBase {


   
    @When("^user is  clicking in login button$")
    public void userIsClickingInLoginButton() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("")).click();
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


    @And("enter the valid name")
    public void enterTheValidName() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter the valid name");
    }

    @And("close the browser")
    public void closeTheBrowser() {
        // Write code here that turns the phrase above into concrete actions
driver.quit();
    }

    @Given("enter the username and password")
    public void enterTheUsernameAndPassword() {
        driver.findElement(By.xpath("//input[@name='customer[email]']")).sendKeys("ank@123");
driver.findElement(By.xpath("//input[@name='customer[password]']")).sendKeys("123");
    }

    @Given("click on login button to navigate in login page")
    public void clickOnLoginButtonToNavigateInLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }

    @Then("verify the title of the page {string}")
    public void verifyTheTitleOfThePage(String expectedText) {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = driver.getTitle();
    Assert.assertEquals(expectedText, actualTitle);
    }

    @Given("click on the catalog")
    public void clickOnTheCatalog() {

    }

    @Given("Select the product you want to buy")
    public void selectTheProductYouWantToBuy() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@name='product[name]']")).click();
    }

    @Then("validate the amount of the product {string}")
    public void validateTheAmountOfTheProduct(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("validate the numbering on add to cart field {string}")
    public void validateTheNumberingOnAddToCartField(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys(arg0);
    }

    @And("click on Add to cart")
    public void clickOnAddToCart() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("click on checkout button")
    public void clickOnCheckoutButton() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Validate the title of checkout page {string}\"")
    public void validateTheTitleOfCheckoutPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into

}

    @And("enter the details for the payment and delivery address")
    public void enterTheDetailsForThePaymentAndDeliveryAddress() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
    }

    @Then("enter the email and password")
    public void enterTheEmailAndPassword() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//div/input[@name=\"customer[email]\"]")).sendKeys("ank@123");
    driver.findElement(By.xpath("//div/input[@name=\"customer[password]\"]")).sendKeys("12763");
    }

    @Then("click on sign in button")
    public void clickOnSignInButton() {


    }

    @Then("click on the catalog button")
    public void clickOnTheCatalogButton() {


    }
}

