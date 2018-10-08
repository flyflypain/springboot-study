package com.example.common;


public enum ErrorEnumType {

	PRAC_0001("this id cannot be found",ResultEnumType.FAILED);
	
	private String message;
	
	private ResultEnumType result;
	
	private ErrorEnumType(String message, ResultEnumType result) {
		this.message = message;
		this.result = result;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public ResultEnumType getResult() {
		return this.result;
	}
}
