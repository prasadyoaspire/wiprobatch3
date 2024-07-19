package com.abc.serviceapp2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@Value("${mydb.username}")
	private String username; 
	
	@Value("${mydb.password}")
	private String password; 
		
	@GetMapping("/login")
	public String getMessageFromConfig(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd) {
		
		if(uname.equals(username) &&  upwd.equals(password) ) {
			return "Login Success";
		}
		
		return "Login Failed";
	}
}
