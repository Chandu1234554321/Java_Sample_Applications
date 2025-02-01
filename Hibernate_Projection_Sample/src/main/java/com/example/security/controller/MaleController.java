package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.entiry.Female;
import com.example.security.entiry.Male;
import com.example.security.repo.MaleRepository;

@RestController
public class MaleController {
	
	@Autowired
	public MaleRepository maleRepo;
	
	@GetMapping(path="/getMaleDetails")
	public String getDetails()
	{
	    Male male=new Male();
	    
	    male.setAge(34);
	    male.setMalaeName("Chandra");
	    male.setMaleAddr("Hyderabad");
	    
	   
	    
        Male male1=new Male();
	    
	    male1.setAge(35);
	    male1.setMalaeName("Sekhar");
	    male1.setMaleAddr("Bangalore");
	    
	    Female  female=new Female();
	    
	    female.setAge(32);
	    female.setFemaleAddr("Bangalore");
	    
	    female.setFemaleName("xxxx");
	    
	    
	    male.setFemale(female);
	    
	    
	    male1.setFemale(female);
	    
	    
	    maleRepo.save(male);
	    
	    maleRepo.save(male1);
	       
		return "Saved Successfully";
		
		
		
	}

}
