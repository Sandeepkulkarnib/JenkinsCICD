package com.jenkins.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test()
	{
		return "Hello, We are Deploying this App from CI/CD Pipeline from Jenkins !!!  - V1";
	}
}
