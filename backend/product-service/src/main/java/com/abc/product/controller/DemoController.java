package com.abc.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class DemoController {
	
	@Autowired
	private Environment env;

	@GetMapping("/demo")
	public String sayHello() {
		return "Hello Service- running on port "+env.getProperty("local.server.port");
	}
}
