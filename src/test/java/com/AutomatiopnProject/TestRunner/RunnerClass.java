package com.AutomatiopnProject.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, plugin = {"html:target/cucumber"}, features = { "src/test/resources/" }, glue = {
		"com.AutomationProject.StepDefs" })

public class RunnerClass {

}