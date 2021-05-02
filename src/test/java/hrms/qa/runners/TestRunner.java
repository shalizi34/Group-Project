package hrms.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/",
		glue="com/hrms/steps", 
		dryRun=false,
		monochrome = true,
		tags= ""
		,plugin= {
				"pretty",
				"json:target/cucumber.json",})

public class TestRunner {

	
}