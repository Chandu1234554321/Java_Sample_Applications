package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.service.UserService;

@SpringBootApplication
public class SbAutowiringApplication {

	public static void main(String[] args) {
	  ConfigurableApplicationContext context=	SpringApplication.run(SbAutowiringApplication.class, args);
	  int count= context.getBeanDefinitionCount();
	   System.out.println("############Defcount##############"+count);
	   
	 UserService  service=context.getBean(UserService.class);
	   
	   String name=service.getName(100);
	   
	   System.out.println("##########Name###############"+name);
	
	}

}
