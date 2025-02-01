package com.example.demo.controller;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
	
	private static final Logger log=Logger.getLogger(LoggerController.class);
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		log.debug("####################Welcome to Logging###########");
		log.info("####################Welcome to Logging###########");
		log.warn("####################Welcome to Logging###########");
		log.error("####################Welcome to Logging###########");
		return "welcome";
	}
}
