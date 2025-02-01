package com.ticket.booking.controller;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.booking.entiry.Address;
import com.ticket.booking.entiry.Student;
import com.ticket.booking.repo.StudentRepo;



@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studRepo;
	

    @RequestMapping(path="/getDetails")
	public String getDetails()
	
	{
		System.out.println("###########12222222222222222222222####################");
        Student student = new Student();
        
        Address addr=new Address();
        
        addr.setCityName("Gidddalur");
        addr.setStreetName("Racherlagate");
        
       
        
        ArrayList set=new ArrayList();
        
        set.add(addr);    
        
        student.setAddresses(set);
        
        student.setStudentName("Siva");;
        
        studRepo.save(student);
        
        System.out.println("###########3333333333333333333333####################");
	
	   return "Welcome to SPring boot";
		 
	}
}
