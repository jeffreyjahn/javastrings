package com.jeffreyahn.firstproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dojo")
public class DojoController {
	
	@RequestMapping("/{word}")
	public String wat(@PathVariable("word") String word) {
		if(word.equals("dojo")) {
			return "the dojo is awesome";
		} else if (word.equals("burbank-dojo")){
			return "Burbank Dojo is located in Socal";
		} else if (word.equals("san-jose")) {
			return "SJ dojo is the hq";
		}else {
			return " wat";
		}
	}
}
