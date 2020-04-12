package com.AutomatioProject.Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BackGroundSteps {

	ScenarioContext scenaioContext;
	public BackGroundSteps(ScenarioContext scenaioContext) {
		this.scenaioContext=scenaioContext;
	}
	static {
		System.setProperty("org.apache.commons.logging.Log","org.apache.commons.logging.impl.SimpleLog");
		System.setProperty("org.apache.commons.logging.SimpleLog.log.org.apache.http","warn");
	}
	
	public void initializeLogger() {
		//String log4jConfigPath = java.nio.file.Paths.get("src/test/reso")
	}
	
	@Before 
	public void setTestDetails(Scenario cucumber) {
		System.out.println("-----------------Starting To execute the test case------------------");
		scenaioContext.testCaseDescription =  cucumber.getName();
		System.out.println("Test case : " +scenaioContext.testCaseDescription);
		System.out.println("--------------------------------------------------------------------");
	}
	
	
	
	@After
	public void getTestDetails() {
	System.out.println("--------------End of Test case ------------------");
		
	}	
	
	
}
