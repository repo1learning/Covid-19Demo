package com.AutomatioProject.Utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeUtils {

	public static String getDateAndTimeInSpecificFormatt(String formatt) {
		DateFormat dateFormat = new SimpleDateFormat(formatt);
		Date date = new Date();
		return dateFormat.format(date);
	}
}
