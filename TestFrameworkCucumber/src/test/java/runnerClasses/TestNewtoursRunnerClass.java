package runnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features=".\\src\\features\\newtours.feature", 
					glue="stepDefinitions"
					)
public class TestNewtoursRunnerClass {

}
