package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateService {
	
	@GetMapping("/add")
	public int sum() {
		return 10+40;
	}
	@GetMapping("/multiply")
	public int multiply() {
		return 10*10;
	}
	@GetMapping("/concatenate")
	public String concatenate(String one, String two) {
		return one + two;
	}

}
