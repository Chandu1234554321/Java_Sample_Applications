package com.example.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.exception.EmployeeNotFound;
import com.example.exception.ProductNotFoundException;


	@RestController
	public class EmployeeController {
		
		@GetMapping("/emp/{empId}")
		public String getMessage(@PathVariable Integer empId)
		{
			 if(empId==100)
			 {
				 throw new ProductNotFoundException();
			 }
				return "welcome";
	    }
		 @ExceptionHandler(value = ProductNotFoundException.class)
	     public ResponseEntity<Object> exception(ProductNotFoundException exception) {
		      return new ResponseEntity<>("Product not found", HttpStatus.INTERNAL_SERVER_ERROR);
		   }

	}
