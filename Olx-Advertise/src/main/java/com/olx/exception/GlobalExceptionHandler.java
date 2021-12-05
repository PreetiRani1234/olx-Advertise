package com.olx.exception;

import org.springframework.http.HttpHeaders;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value= {InvalidStatusIdException.class,InvalidStatusIdException.class})
	private ResponseEntity<Object> handleExceptionInternal(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidCategoryIdException.class,InvalidCategoryIdException.class})
	private ResponseEntity<Object> handleExceptionInternalCategory(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidAuthTokenException.class,InvalidAuthTokenException.class})
	private ResponseEntity<Object> handleExceptionInternalAuthToken(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidAdvertiseIdException.class,InvalidAdvertiseIdException.class})
	private ResponseEntity<Object> handleExceptionInternalAdvertiseId(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidOnDateException.class,InvalidOnDateException.class})
	private ResponseEntity<Object> handleExceptionInternalOnDate(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidFromDateException.class,InvalidFromDateException.class})
	private ResponseEntity<Object> handleExceptionInternalFromDate(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidStartIndexException.class,InvalidStartIndexException.class})
	private ResponseEntity<Object> handleExceptionInternalStartIndex(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidRecordNoException.class,InvalidRecordNoException.class})
	private ResponseEntity<Object> handleExceptionInternalRecordNo(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidDateConditionException.class,InvalidDateConditionException.class})
	private ResponseEntity<Object> handleExceptionInternalDateCondition(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}
	
	@ExceptionHandler(value= {InvalidDateFormatException.class,InvalidDateFormatException.class})
	private ResponseEntity<Object> handleExceptionInternalDateFormat(RuntimeException exception, String string,
			HttpHeaders httpHeaders, HttpStatus badRequest, WebRequest request) {
		// TODO Auto-generated method stub
		return handleExceptionInternal(exception,exception.toString(),new HttpHeaders(),
				HttpStatus.BAD_REQUEST,request);
	}

}
