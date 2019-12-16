package com.example.graphics.exception;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private ExceptionCode exceptionCode;
	
	private String message;
	
	public CustomException(ExceptionCode exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

	public ExceptionCode getExceptionCode() {
		return exceptionCode;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}