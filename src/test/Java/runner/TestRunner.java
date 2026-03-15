package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/feature"}, glue = {"stepdef"},tags = "@sun")
@RunWith(Cucumber.class)
public class TestRunner{


}
