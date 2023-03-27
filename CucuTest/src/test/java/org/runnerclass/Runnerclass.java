package org.runnerclass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src\\test\\resources\\Features",
		glue= {"org.stepdefinition"}, dryRun =false,
		plugin = { 
				"html:target/cucumber-reports/Cucumber.html"},
//				"html:target/cucumber-reports"},
		monochrome = true
	)
public class Runnerclass {
	
	


}
