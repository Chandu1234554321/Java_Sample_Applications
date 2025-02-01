package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee getEmployee()
	{
		Employee emp=new Employee();
		
		System.out.println("count###########emp###########"+emp);
		
		return emp; 
	}

}
