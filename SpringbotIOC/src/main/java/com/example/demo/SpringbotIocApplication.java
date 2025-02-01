package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.component.Student;
import com.example.service.Employee;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.service","com.example.demo"})
public class SpringbotIocApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext  context=SpringApplication.run(SpringbotIocApplication.class, args);
		int count= context.getBeanDefinitionCount();
		System.out.println("count######################"+count);
		
		Student stud=context.getBean(Student.class);
		Student stud1=context.getBean(Student.class);
		System.out.println("stud######################"+stud);
		System.out.println("stud1######################"+stud1);
		
		
		
	}
	
}
