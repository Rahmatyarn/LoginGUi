package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReporting;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\15716\\eclipse-workspace\\com.tekschool.dealernaqib\\src\\text\\resources\\features\\Test.feature",
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
	
	@AfterClass
	public static void generateReport() {
		CucumberReporting.reportConfig();
	}

}
