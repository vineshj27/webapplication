package com.webapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplication {

	@GetMapping(path="/get")
	public String Message() {
		return "Get Message";
	}
	
}
