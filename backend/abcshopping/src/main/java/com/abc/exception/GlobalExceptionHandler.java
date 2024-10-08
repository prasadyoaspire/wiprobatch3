package com.abc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> hanldeResourceNotFoundExcepiton(Exception e) {
		
		ErrorResponse errorResponse = new ErrorResponse(e.getMessage(),HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidLoginException.class)
	public ResponseEntity<ErrorResponse> hanldeInvalidLoginException(Exception e) {
		
		ErrorResponse errorResponse = new ErrorResponse(e.getMessage(),HttpStatus.UNAUTHORIZED.value());
		
		return new ResponseEntity<>(errorResponse,HttpStatus.UNAUTHORIZED);
	}
}
