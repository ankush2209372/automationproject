package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class SaucedemoStepdefs extends TestBase {

    @Given("enter the username and the password")
    public void enterTheUsernameAndThePassword() {
        driver.findElement(By.xpath("//input[@name='customer[email]']")).sendKeys("ankush@gmail.com");
driver.findElement(By.xpath("//input[@name='customer[password]']")).sendKeys("ankush");
    }

    @Given("click on the login tab")
    public void clickOnTheLoginTab() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();

    }

    @Given("Click on SignIn  button")
    public void clickOnSignInButton() {

        driver.findElement(By.xpath("")).click();
    }

    @Given("click on catalog tab")
    public void clickOnCatalogTab() {
        driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();


    }

    @Then("Select the product to purchase")
    public void selectTheProductToPurchase() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//a//h3[contains(text(),'Black heels')]")).click();
    }
}
