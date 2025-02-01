package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.security.controller.MaleController;
import com.example.security.controller.PersonController;
import com.example.security.controller.StudentController;


@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		 
		 SpringApplication.run(OneToManyApplication.class, args);
		 
		 ConfigurableApplicationContext applicationContext = SpringApplication.run(OneToManyApplication.class, args);
		 
		 System.out.println("#############11111111111111111##################");
		 
		// StudentController  controller=applicationContext.getBean(StudentController.class);
		 
	//	 String msg=controller.getDetails();
		 
		// System.out.println("################################"+msg);
		 
		 PersonController  con=applicationContext.getBean(PersonController.class);
		 
		 con.savePerson();
		 
		 //MaleController maleCOntroller=applicationContext.getBean(MaleController.class);
		 
		 //String maleMsg=maleCOntroller.getDetails();
		 
		 //System.out.println("##########maleMsg######################"+maleMsg);
	}

}
