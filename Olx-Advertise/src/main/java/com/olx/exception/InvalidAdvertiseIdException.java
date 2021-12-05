package com.olx.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)

public class InvalidAdvertiseIdException extends RuntimeException{
private String message;
	public InvalidAdvertiseIdException() {
		this.message="";
	}
	
	public InvalidAdvertiseIdException(String message) {
		super();
		this.message=message;
	}

	@Override
	public String toString() {
		return "Invalid Stock id "+this.message;
	}

}

