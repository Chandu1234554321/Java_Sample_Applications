package com.cqrs.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class CircularDependencyA {
	
	private CircularDependencyB  cirB;
	
	//This one way of avoid circular dependency
	/*@Autowired
	public CircularDependencyA(@Lazy CircularDependencyB  cirB)
	{
		this.cirB=cirB;
	}
	*/
	//THis is another way of avoid circular dependecny.
	  @PostConstruct
	  public void init() {
		  
		  this.cirB=cirB;
	       
	  }

}
