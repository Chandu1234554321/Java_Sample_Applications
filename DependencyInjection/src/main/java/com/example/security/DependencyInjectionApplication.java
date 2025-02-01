package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.security.test.Department;

@SpringBootApplication
public class DependencyInjectionApplication {

	@Autowired
	Department dept;
	
	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		System.out.println("##########main mrhtod###################");
		
	}
	
	public void run(String args)
	{
		dept.displayMessage();
	}

}
