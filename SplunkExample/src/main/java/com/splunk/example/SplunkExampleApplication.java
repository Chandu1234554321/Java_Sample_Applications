package com.splunk.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/splunk")
public class SplunkExampleApplication {
	
	org.apache.logging.log4j.Logger logInfo=LogManager.getLogger(SplunkExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SplunkExampleApplication.class, args);
	}
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		logInfo.info("#################Welcome to Splunk app#############");
		
	    return "logInfo";	
	}

}
