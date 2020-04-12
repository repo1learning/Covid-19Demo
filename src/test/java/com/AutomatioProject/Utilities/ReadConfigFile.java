package com.AutomatioProject.Utilities;

import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	static Properties prop ;
	static {
		try (InputStream input = ReadConfigFile.class.getClassLoader().getResourceAsStream("config.properties")) {

            prop = new Properties();

            if (input == null) {
            	System.out.println("Sorry, unable to find config.properties");
            }

            prop.load(input);
	}catch (Exception e) {
		e.getMessage();
		}
	}
	
	public String getCovid19Url() {
		return prop.getProperty("com.automationProject.ApiUrl");
	}

	public String getTotalCasesUrl() {
		return prop.getProperty("com.automationProject.TotalCases");
	}

}
