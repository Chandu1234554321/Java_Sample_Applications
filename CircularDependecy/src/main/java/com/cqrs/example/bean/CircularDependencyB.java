package com.cqrs.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyB {
	
private CircularDependencyA  cirA;
	
	@Autowired
	public CircularDependencyB(CircularDependencyA  cirA)
	{
		this.cirA=cirA;
	}

	public void setCircA(CircularDependencyA circularDependencyA) {
		// TODO Auto-generated method stub
		
	}

	

}
