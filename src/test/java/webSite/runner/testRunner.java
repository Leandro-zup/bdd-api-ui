package webSite.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"~@notImplemented"},
        features = {"src/test/resources"},
        plugin = {"html:target/cucumber-reports"},
        glue = { "webSite.steps"},
        monochrome = true,
        dryRun = false)
public class testRunner {
}
