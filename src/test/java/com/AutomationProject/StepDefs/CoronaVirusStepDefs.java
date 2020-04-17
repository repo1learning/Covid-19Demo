package com.AutomationProject.StepDefs;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.AutomatioProject.Utilities.ScenarioContext;
import com.AutomatioProject.Utilities.apiUtils;

import cucumber.api.java.en.Given;


public class CoronaVirusStepDefs {
	
	final static Logger logger = Logger.getLogger(CoronaVirusStepDefs.class);
	
	private ScenarioContext scenarioContext;
	private apiUtils apiUtils;

	public CoronaVirusStepDefs(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
		this.apiUtils = new apiUtils();
	}

	@Given("^I have details about pandemic from all over the world$")
	public void i_have_details_about_pandemic_from_all_over_the_world() throws Throwable {
		int status = apiUtils.getresponse(scenarioContext.configFile.getCovid19Url()).getStatusCode();
		Assert.assertEquals("Status is not same .. Seems to an issue with API", 200, status);
	}

	@Given("^I get total number of cases in the world$")
	public void i_get_total_number_of_cases_in_the_worl() throws Throwable {
		JSONObject totalCasesResponse = new JSONObject(apiUtils.getresponse(scenarioContext.configFile.getTotalCasesUrl()).asString());
		logger.info(totalCasesResponse.toString());
		Assert.assertNotNull(totalCasesResponse);
	}

	@Given("^I have total number of cases in (.*)$")
	public void i_get_total_number_of_cases_in_India(String country) throws Throwable {
		JSONArray totalCasesResponse = new JSONArray(apiUtils.getresponse(scenarioContext.configFile.getCovid19Url()).asString());
		JSONObject countriesInfo;
		for(int i=0; i<totalCasesResponse.length();i++){
			
			if((totalCasesResponse.getJSONObject(i).get("country").equals(country))){
				countriesInfo = totalCasesResponse.getJSONObject(i);
				logger.info("Todays death in "+country+" : " + countriesInfo.get("deaths"));
				logger.info("Thread being used : "+Thread.currentThread().getId());
				Assert.assertNotNull(countriesInfo);

			}
		}
		
	}
}
