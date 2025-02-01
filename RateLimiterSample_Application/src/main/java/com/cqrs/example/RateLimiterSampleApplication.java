package com.cqrs.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.cqrs.example.component.RateLimitingFilter;

@SpringBootApplication
public class RateLimiterSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateLimiterSampleApplication.class, args);
	}
	
}
