package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public String index() {
		return "Greetings from Tanzu-101";
	}

	@RequestMapping(value = "/blarg")
	public String blarg() {
		return "Greetings from blarg";
	}
}