package com.AutomatioProject.Utilities;
import org.apache.log4j.Logger;

import com.AutomationProject.StepDefs.CoronaVirusStepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class BackGroundSteps {

	final static Logger logger = Logger.getLogger(CoronaVirusStepDefs.class);

	ScenarioContext scenaioContext;

	public BackGroundSteps(ScenarioContext scenaioContext) {
		this.scenaioContext = scenaioContext;
	}

	static {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
		System.setProperty("org.apache.commons.logging.SimpleLog.log.org.apache.http", "warn");
	}

	@Before
	public void setTestDetails(Scenario cucumber) {
		System.out.println("-----------------Starting To execute the test case------------------");
		scenaioContext.testCaseDescription = cucumber.getName();
		logger.info("Test case : " + scenaioContext.testCaseDescription);
		System.out.println("--------------------------------------------------------------------");
	}

	@After
	public void getTestDetails() {
		System.out.println("--------------End of Test case ------------------");

	}

}
