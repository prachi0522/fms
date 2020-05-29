package com.capgimini.fmsjpahibernate.validation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ForesteryValidation {
	
	public static boolean dayValidation(String str) 
	{ 
		return ((str != null) 
				&& (!str.equals("")) 
				&& (str.matches("Sunday||Monday||Tuesday||Wednesday||Thursday||Friday||Saturday"))); 
	}

	public static boolean isEmail(String email) 
	{  
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
				"[a-zA-Z0-9_+&*-]+)*@" + 
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
				"A-Z]{2,7}$"; 

		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) { 
			return false; } else {

				return pat.matcher(email).matches(); 
			}

	} 

	public static boolean dateValidation(String d) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try {
			Date date = sdf.parse(d); 
			Date today = new Date();
			return date.before(today); 
		} catch (Exception e) {
			return true;
		}
	}

	public static boolean phoneValidation(String num) { 

		String phone ="^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";

		Pattern pattern = Pattern.compile(phone);
		if(num==null) {
			return false;   
		}
		return pattern.matcher(num).matches();
	}
	public static boolean isNumber(String num) {
		if (num.matches("[0-9]+")) {
			return true;
		}
		return false;
	} 

	public static boolean isStringAlphabet(String str) 
	{ 
		return ((str != null) 
				&& (!str.equals("")) 
				&& (str.matches("^[a-zA-Z]*$"))); 
	}


}