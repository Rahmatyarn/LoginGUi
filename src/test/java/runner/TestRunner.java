package runner;

import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReporting;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:features",
		glue = "stepDefinitions",  // In glue we say where the step definition is located
		tags = "@Test",   // 
		dryRun = false,
		monochrome = true,
		strict = true,
		// plugins are used for generating the reports
		plugin = {"pretty", 
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json"},
				
		publish = true
		)

public class TestRunner {
	
	@After
	public static void generateReport() {
		CucumberReporting.reportConfig();
	}

}
