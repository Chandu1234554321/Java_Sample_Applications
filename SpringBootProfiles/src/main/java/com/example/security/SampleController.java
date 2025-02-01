package com.example.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class SampleController {
	
	@Value("${spring.application.name}")
	private String name;
	
   
    @RequestMapping(value="/hello")
    public String name() {
    return name;
    }
}