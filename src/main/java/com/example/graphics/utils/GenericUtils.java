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
	
	public static boolean printCanvas(String[][] canvas) {
		for (int row = 0; row < canvas.length; row++) {
			for (int col = 0; col < canvas[row].length; col++) {
				System.out.print(canvas[row][col] + " ");
			}
			System.out.println();
		}
		return true;
	}
}
