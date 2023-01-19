package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
        (
                features = "src/test/java/Feature/Registration.feature",
                glue = "StepDefintions",
                plugin = { "pretty",
                        "html:target/CucumberReports/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cukes.xml",
                        "rerun:target/rerun.txt"},
                tags = "@smoke"
        )
public class MyRunner extends AbstractTestNGCucumberTests {
}
