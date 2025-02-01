package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.repo.UserRepository;

@RestController
public class SecurityController {
	
	private UserRepository userRepo;
	
	public SecurityController(UserRepository userRepo)
	{
		this.userRepo=userRepo;
	}
	
	@GetMapping("/welcome")
	public String sayWelcome()
	{
		return "Welcome Spring Security";
	}
	@GetMapping("/contact")
	public String contactWelcome()
	{
		return "Welcome Spring Security ! 9830498374849";
	}
	
	@PostMapping("/save")
	public User saveData(@RequestBody User user)
	{
		return userRepo.save(user);
	}

}
