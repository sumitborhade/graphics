package com.example.graphics.utils;

import java.util.regex.Pattern;

public class GenericUtils {

	public static boolean isInteger(String stringNumber) {
		boolean isInteger = false;
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		
	    if (stringNumber != null) {
	        isInteger = pattern.matcher(stringNumber).matches();
	    }
	    
	    return isInteger;
	}
}
