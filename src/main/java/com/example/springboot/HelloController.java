package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public String index() {
		return "Hello";
	}
	
	@RequestMapping(value = "/tanzu")
	public String index2() {
		return "Hello from Tanzu";
	}
}