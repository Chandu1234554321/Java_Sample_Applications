package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.Payment;
import com.example.demo.bean.Product;
import com.example.demo.service.PaymentService;

@SpringBootApplication
public class SbAutomacityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context=SpringApplication.run(SbAutomacityApplication.class, args);
	
		PaymentService  service=context.getBean(PaymentService.class);
		
		Product prod=new Product();
		
		prod.setProductManifactuer("Kolkata");
		prod.setProductName("Laptop");
		prod.setQuality(10);
		
		Payment  payment=new Payment();
		
		payment.setIsSuccess("success");
		payment.setMode("Cash");
		
		
		service.saveData(prod, payment);
	
	}

}
