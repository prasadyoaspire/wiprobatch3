package com.abc.securityapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() {
		
		String message = "Hello Spring Security App!";
		return new ResponseEntity<>(message,HttpStatus.OK);
	}
}
