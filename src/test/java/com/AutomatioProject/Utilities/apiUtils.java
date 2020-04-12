package com.AutomatioProject.Utilities;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.Response;

public class apiUtils{

	public Response getresponse(String url) {
		try {
			return	given().get(url);		
		}catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return null;
	}
}
