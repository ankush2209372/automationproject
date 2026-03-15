package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class TestHooks extends TestBase {

    @Before
    public void setUp(){
       openBrowser();
    }
    @After
    public void quit(){
        driver.quit();
    }
}
