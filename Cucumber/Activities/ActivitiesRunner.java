package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Features",
		glue = {"stepDefinitions"},
		tags = "@activity2",
		//plugin = {"pretty"},
		//plugin = {"html: test-reports"},
		plugin = {"json: test-reports/json-report.json"},
		monochrome = true
			
)

public class ActivitiesRunner {}
