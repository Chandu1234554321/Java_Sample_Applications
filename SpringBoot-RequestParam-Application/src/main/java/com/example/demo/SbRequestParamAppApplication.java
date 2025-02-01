package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.bean.ContactUsEntity;
import com.example.demo.bean.Student;
import com.example.demo.bean.StudentCompositor;
import com.example.demo.repo.ContactRepo;
import com.example.demo.repo.StudentRepository;

@SpringBootApplication
public class SbRequestParamAppApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SbRequestParamAppApplication.class, args);
		System.out.println("#############Main class method################");
	    
	   ContactRepo repo=context.getBean(ContactRepo.class);
	   StudentRepository studentRepo=context.getBean(StudentRepository.class);
	   StudentCompositor  compositeKey=new StudentCompositor();
	   
	   compositeKey.setStudentId(300);
	   compositeKey.setStudentName("Chandu");
			   
	   Student s=new Student();
	   
	   s.setCourse("CS1");
	   s.setId(compositeKey);
	   s.setEmail("chnadra@gmail.com");
	   s.setStudentAddr("AP");
	   
	   ContactUsEntity contacts=new ContactUsEntity();
	  // contacts.setCid(100);
	   contacts.setCname("Siva");
	   //contacts.setCurrentDate();
	   contacts.setUpdateDate(LocalDate.of(2013, 12, 12));
	   
	    repo.save(contacts);
	   
	//   List<ContactUsEntity>  contacts1=(List<ContactUsEntity>) repo.fecthCustomerCount();
	   /*ContactUsEntity  contacts1= new ContactUsEntity();
	   
	    for(int i=0;  i<contacts1.size(); i++)
	    {
	    	ContactUsEntity contaDetails=contacts1.get(i);
	    	
	    	System.out.println("##########"+contaDetails.getCid());
	    	System.out.println("##########"+contaDetails.getCname());
	    	
	    	System.out.println("###########################");
	    	
	    	
	    }
	    
	    List<ContactUsEntity>  empList1=(List<ContactUsEntity>) repo.getEmpByName("Siva");
		  
	    for(int i=0;  i<empList1.size(); i++)
	    {
	    	ContactUsEntity contaDetails1=empList1.get(i);
	    	
	    	System.out.println("######EM:PID###"+contaDetails1.getCid());
	    	System.out.println("####EMPNAME#####"+contaDetails1.getCname());
	    	
	    	System.out.println("###########################");
	    	
	    	
	    }
	    
	    List<ContactUsEntity>  empList2=(List<ContactUsEntity>) repo.getEmpIdAndByName("OD1","Siva");
		  
	    for(int i=0;  i<empList2.size(); i++)
	    {
	    	ContactUsEntity contaDetails1=empList2.get(i);
	    	
	    	System.out.println("######EM:PID###"+contaDetails1.getCid());
	    	System.out.println("####EMPNAME#####"+contaDetails1.getCname());
	    	
	    	System.out.println("###########################");
	    	
	    	
	    }
	    
	  //System.out.println("##########"+contacts1); */
	   
	   studentRepo.save(s);
	 
			   
	
	}

}
