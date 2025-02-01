package com.cqrs.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cqrs.example.bean.CircularDependencyA;

@SpringBootApplication
public class CircularDependecyApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext  context=SpringApplication.run(CircularDependecyApplication.class, args);
	CircularDependencyA  cirA= context.getBean(CircularDependencyA.class);
	System.out.println(cirA.toString());
	  
	}

}
