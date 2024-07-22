package com.abc.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abc.kafkaproducer.service.ProducerService;

@RestController
@RequestMapping("/api")
public class ProducerController {

	@Autowired
	private ProducerService producerService;
	
	@GetMapping("/send")
	public ResponseEntity<String> publishMessage(@RequestParam String message) {
		producerService.sendMsg(message);
		return new ResponseEntity<>("Message sent",HttpStatus.OK);
	}
}
