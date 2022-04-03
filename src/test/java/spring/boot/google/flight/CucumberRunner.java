package spring.boot.google.flight;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        features = "src/test/java/spring/boot/google/flight/cucumber/features",
        glue = "spring.boot.google.flight.cucumber.steps",
        tags = { "not @skip" },
        plugin = {
                "json:target/cucumber.json",
                "pretty"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
