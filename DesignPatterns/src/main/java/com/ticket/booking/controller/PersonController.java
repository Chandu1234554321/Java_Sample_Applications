package com.ticket.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.ticket.booking.entiry.Passport;
import com.ticket.booking.entiry.Person;
import com.ticket.booking.repo.PersonRepo;


@Controller
public class PersonController {

	@Autowired
	private PersonRepo  personRepo;
	
	@PostMapping("/save")
	public void savePerson()
	{
		Person p=new Person();
		
		p.setPersonId(100);
		p.setPersonAddr("Bangalore");
		p.setPersonName("Chandu");
		
		Passport passport=new Passport();
		
		passport.setIssueLoc("Bangalore");
		
		passport.setPassportNumber("S4300842");
	    
		p.setPassInfo(passport);
		
		personRepo.saveAndFlush(p);
			
	}
}
