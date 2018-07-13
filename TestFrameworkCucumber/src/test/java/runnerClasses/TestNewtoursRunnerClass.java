package runnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features=".\\src\\features\\newtours.feature", 
					glue="stepDefinitions",
					plugin = {"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report" + 1987 + ".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}
					)
public class TestNewtoursRunnerClass {

}
