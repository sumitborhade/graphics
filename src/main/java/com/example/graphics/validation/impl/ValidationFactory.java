package com.example.graphics.validation.impl;

import java.util.HashMap;
import java.util.Map;

import com.example.graphics.validation.Validation;

public class ValidationFactory {

	private static Map<String, Validation> validationEntitiesMap = new HashMap<>();
	
	static {
		validationEntitiesMap.put("C", new CanvasValidation());
		validationEntitiesMap.put("R", new RectangleValidation());
		validationEntitiesMap.put("L", new LineValidation());
	}
	
	public static Validation getValidationEntity(String inputType) {
		return validationEntitiesMap.get(inputType);
	}
}
