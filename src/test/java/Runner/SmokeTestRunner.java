package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

  
@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
	plugin = {"pretty" , "html:target/cucumberHTMLRepo.html" , "json:target/cucumberJSON.json" }	,
	tags="@SmokeTest2",
	features = {"src/feature/test"},
	glue = {"StepDefinition"}
		 	)

public class SmokeTestRunner {

}


