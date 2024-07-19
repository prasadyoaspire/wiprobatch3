package com.abc.serviceapp1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${message}")
	private String msg; 
	
	@Value("${mydb.username}")
	private String username; 
	
	@Value("${mydb.password}")
	private String password; 
	
	
	@GetMapping("/demo")
	public String getMessageFromConfig() {
		
		return msg+ " "+username+" "+password;
	}
}
