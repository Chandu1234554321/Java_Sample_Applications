package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.ProductRepo;

@SpringBootApplication
public class SbProjectionsApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext  context=SpringApplication.run(SbProjectionsApplication.class, args);
	 
	ProductRepo  prodRepo=context.getBean(ProductRepo.class);
	
	
	
	}

}
