package com.ticket.booking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ticket.booking.controller.StudentController;
import com.ticket.booking.entiry.Address;
import com.ticket.booking.entiry.Student;

@SpringBootApplication
public class OneToManyApplication {

	public static void main(String[] args) {
		
		
		 Address addr=new Address();
		 
		 Address addr1=new Address();
		 
		 List<Address>  listAddr=new ArrayList();
		 
		 addr.setCityName("Bangalore");
		 addr.setHousenumber(100);
		 addr.setStreetName("Tech city");
		 
		 addr1.setCityName("Hyd");
		 addr1.setHousenumber(200);
		 addr1.setStreetName("Tech city");
		 
		 listAddr.add(addr);
		 
		 Student stud=new Student();
		 Student stud1=new Student();
		 stud.setRollNumber(100);
		 stud.setStudentName("Chandu");
		 stud.setAddresses(listAddr);
		 
		 
		 
		 SpringApplication.run(OneToManyApplication.class, args);
		 
		 ConfigurableApplicationContext applicationContext = SpringApplication.run(OneToManyApplication.class, args);
		 
		 System.out.println("#############11111111111111111##################");
		 
		 StudentController  controller=applicationContext.getBean(StudentController.class);
		 
		 
		 
	      String msg=controller.getDetails();
		 
		 System.out.println("################################"+msg);
		 
		// PersonController  con=applicationContext.getBean(PersonController.class);
		 
		 //con.savePerson();
		 
		 //MaleController maleCOntroller=applicationContext.getBean(MaleController.class);
		 
		 //String maleMsg=maleCOntroller.getDetails();
		 
		 //System.out.println("##########maleMsg######################"+maleMsg);
	}

}
