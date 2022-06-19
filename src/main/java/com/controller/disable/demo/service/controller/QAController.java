package com.controller.disable.demo.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qa")
public class QAController {
	
	Logger logger = LoggerFactory.getLogger(DevController.class);

	@GetMapping(value = "/svc")
	public String sayHellow() {
		logger.info("QA Controller - called");
		return "Hello !!";
	}

}
