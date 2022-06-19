package com.controller.disable.demo.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
@ConditionalOnProperty("dev.controller.enabled")
public class DevController {
	
	Logger logger = LoggerFactory.getLogger(DevController.class);

	@GetMapping(value = "/svc")
	public String sayHellow() {
		logger.info("Dev Controller - called");
		return "Hello !!";
	}

}
