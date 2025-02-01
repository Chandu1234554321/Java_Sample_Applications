package com.example.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ProductNotFoundException;
import com.example.exception.beans.Product;

@RestController
public class ExceptionController {
	
	@GetMapping("/welcome/{prodId}")
	public String getMessage(@PathVariable("prodId") Integer id)
	{
	    if(id==100)
	    {
	    	throw new ProductNotFoundException();
	    }
		return "welcome";
	}

}
