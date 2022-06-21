package com.controller.disable.demo.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev/profile")
@Profile("dev")
public class DevProfileController {
	
	Logger logger = LoggerFactory.getLogger(DevProfileController.class);

	@GetMapping(value = "/svc")
	public String sayHellow() {
		logger.info("Dev Profile Controller - called");
		return "Hello !!";
	}

}
