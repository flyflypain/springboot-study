package com.example.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(IdNotFoundException.class)
	@ResponseBody
	public ResponseEntity<String> IdNotFoundHandler(IdNotFoundException e){
		return new ResponseEntity<String>(ErrorEnumType.PRAC_0001.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}

