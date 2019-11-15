package testRunener;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//example
@CucumberOptions(
		features = "src/test/resources/features",
		//es usado para unir features con los pasos
		glue = {"stepDefinition"},
		tags = "not @ignore"
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
