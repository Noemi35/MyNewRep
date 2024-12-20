package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/java/features", plugin="json:target/jsonReports/cucumber-reports.json", glue={"stepDefinitions"})
//tags are for running specific tests
//tags = "@DeletePlace"
@RunWith(Cucumber.class)
public class TestRunner {
}
