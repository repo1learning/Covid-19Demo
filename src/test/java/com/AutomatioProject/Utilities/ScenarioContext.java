package com.AutomatioProject.Utilities;

public class ScenarioContext {
	
	public TimeOutUtils timeOutUtils;
	public String testCaseDescription;
	public ReadConfigFile configFile;
	
	public ScenarioContext() {
		timeOutUtils = new TimeOutUtils();
		configFile = new ReadConfigFile();
	}
}
