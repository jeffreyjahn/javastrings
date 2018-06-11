package com.jeffreyahn.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "hey man";
	}
	@RequestMapping("/random")
	public String random() {
		return "waekslcmlamcsalkmclxzkmc";
	}
	@RequestMapping("/world")
	public String world() {
		return "asolmclkx";
	}
	@RequestMapping("/users/{userID}")
	public String showUser(@PathVariable("userID") String userID) {
		return "User: " + userID;
	}
}
