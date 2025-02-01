package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.repo.RedisRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private RedisRepository repo;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp)
	{
		
		return repo.save(emp);
		
	}
	@Cacheable(key="#empId" , value="Employee",unless="#empId>300")
	@GetMapping("/getMapping/{empId}")
	public Optional<Employee> getEmployeeDetails(@PathVariable Integer empId)
	{
		return repo.findById(empId);
		
	}
	@Cacheable(key="#empId" , value="Employee",unless="#empId>300")
	@DeleteMapping("/delete/{empId}")
	public Optional<Employee> deleteDetails(@PathVariable Integer empId)
	{
		return repo.findById(empId);
		
	}
}
