package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
plugin = {"pretty" , "html:target/cucumberHTMLRepo.html" , "json:target/cucumberJSON.json","rerun:target/rerun.txt" }	,
tags="@SmokeTest2",
features = {"@target/rerun.txt"}	,
monochrome = true,
glue = {"StepDefinition"}
	 	)

public class RerunSmokeTest {

}
