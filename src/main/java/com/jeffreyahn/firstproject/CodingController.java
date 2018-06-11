package com.jeffreyahn.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String index() {
		return "hi man";
	}
	@RequestMapping("python")
	public String python() {
		return "Python was better";
	}
	@RequestMapping("java")
	public String java() {
		return "java was wat";
	}
	
}
