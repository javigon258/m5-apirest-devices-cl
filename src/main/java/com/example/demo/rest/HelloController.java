package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController
//@Component
@RequestMapping("/api")
public class HelloController {

	private static Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping
	public String hello() {
		log.info("Executing method hello");
		return "Hola mundo";
	}
}
