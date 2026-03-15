import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ank@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12309@!aA");
    driver.findElement(By.xpath("//input[@name='mobile number']")).sendKeys("098754321");
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ank");

    }

}
