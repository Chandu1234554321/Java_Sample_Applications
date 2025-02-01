package com.cqrs.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	    @GetMapping("/api/test")
	    public String testRateLimiting() {
	        return "Request Successful!";
	    }
	}