package com.jeffreyahn.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/your_server")
public class HelloHuman {
	@RequestMapping("/")
	public String index( @RequestParam(value="firstName", required =false) String firstName, @RequestParam(value="lastName", required =false) String lastName) {
		return "Hello " + firstName + " " + lastName;
	}
}
