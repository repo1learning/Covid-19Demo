package com.AutomatiopnProject.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, plugin = {"html:target/cucumber"}, features = { "src/test/resources/" }, glue = {
		"com.AutomationProject.StepDefs" })

public class RunnerClass {

}
