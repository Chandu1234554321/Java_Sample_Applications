package com.example.security.controller;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.entiry.Address;
import com.example.security.entiry.Student;
import com.example.security.repo.AddressRepo;
import com.example.security.repo.StudentRepo;



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
        
        Address addr1=new Address();
        
        addr1.setCityName("Kadapa");
        addr1.setStreetName("airportroad");
        
        ArrayList set=new ArrayList();
        
        set.add(addr);    set.add(addr1);
        
        student.setAddresses(set);
        
        student.setStudentName("Rahul");;
        
        studRepo.save(student);
        
        System.out.println("###########3333333333333333333333####################");
	
	   return "Welcome to SPring boot";
		 
	}
}
