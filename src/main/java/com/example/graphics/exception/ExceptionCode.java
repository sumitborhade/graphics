package com.example.graphics.exception;

public enum ExceptionCode {
	
	NULL_INPUT("The input is null"),
	INCORRECT_DESIGN_TYPE("Design type entered is incorrect!"),
	INCORRECT_CANVAS_INPUT_PARAMS("# of Input params Canvas should be 3!"),
	INPUT_SHOULD_BE_INTEGER("2nd and 3rd params of a Canvas should be integer.");
	
	private String message;
	
	private ExceptionCode(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
