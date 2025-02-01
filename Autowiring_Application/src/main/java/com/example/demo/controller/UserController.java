package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService  userService;
	
	@GetMapping("/welcome/{number}")
	public String getNumber(@PathVariable("number") int number)
	{
		return userService.getName(number);
		
	}
	
}
