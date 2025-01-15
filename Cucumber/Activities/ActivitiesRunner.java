package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Features",
		glue = {"stepDefinitions"},
		//run scenario which has either the tags
		//tags = "@PromptAlert or @ConfirmAlert",
		//run scenario which has both the tags
		tags = "@SmokeTest and @SimpleAlert",
		//plugin = {"pretty"},
		//create HTML report file
		//plugin = {"html: test-reports"},
		//create JSON report file (we cant create folder we need to specifiy file name only
		plugin = {"json: json-report.json"},
		monochrome = true
			
)

public class ActivitiesRunner {}
