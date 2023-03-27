package Runnr;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/day.feature",glue = "Stepdefin",dryRun = false, monochrome = true)
public class RunnrClass {
	

}
