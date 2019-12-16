package com.example.graphics.validation.impl;

import com.example.graphics.exception.CustomException;
import com.example.graphics.exception.ExceptionCode;
import com.example.graphics.utils.GenericUtils;
import com.example.graphics.validation.Validation;

public class CanvasValidation implements Validation {

	@Override
	public boolean validate(String[] inputArray) {
		
		if(inputArray.length != 3) {
			throw new CustomException(ExceptionCode.INCORRECT_CANVAS_INPUT_PARAMS);
		}
		
		if(!GenericUtils.isInteger(inputArray[1]) || !GenericUtils.isInteger(inputArray[2]) ) {
			throw new CustomException(ExceptionCode.INPUT_SHOULD_BE_INTEGER);
		}
		return true;
	}
}
