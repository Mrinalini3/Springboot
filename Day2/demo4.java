package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo4 {
	@Value("Hello ")
	private String greet;
	
	@Value("${name}")
	private String name;
	
	@GetMapping("/greet")
	public String greet() {
		return "hello "+name;
	}
}
