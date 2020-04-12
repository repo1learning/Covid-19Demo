package com.AutomatioProject.Utilities;

import java.lang.invoke.MethodHandles;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class TimeOutUtils {

	private static final Logger LOGGER = LogManager.getLogger(MethodHandles.lookup().getClass());

	private static long apiResponseTimeOut = 60000;
	
	public long ApiTimeOut() {
		LOGGER.info("Time Out : " +apiResponseTimeOut);
		return apiResponseTimeOut;
	}
}
