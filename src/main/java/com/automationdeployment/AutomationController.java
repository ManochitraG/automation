package com.automationdeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {
	
	@GetMapping(value = "/getValue")
	public String get() {
		return "Hello Mano";
	}

}
