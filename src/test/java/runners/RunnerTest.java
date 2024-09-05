package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/features/example.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty"}
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
