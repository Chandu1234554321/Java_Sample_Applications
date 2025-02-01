package com.example.exception.handler;

import org.springframework.boot.WebApplicationType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ProductNotFoundException;


@RestController
@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public String handle(Model model) {
		
		String mes="problem in processing request";
		model.addAttribute("message",mes);
		return "error";
	
	}

}
