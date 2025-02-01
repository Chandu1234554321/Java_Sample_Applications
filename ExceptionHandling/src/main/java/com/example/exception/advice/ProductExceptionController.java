
package com.example.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.exception.*;

@ControllerAdvice
public class ProductExceptionController {
	
	 @ExceptionHandler(value = ProductNotFoundException.class)
     public ResponseEntity<Object> exception(ProductNotFoundException exception) {
	      return new ResponseEntity<>("Product not found", HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	
	  @ExceptionHandler(value = EmployeeNotFound.class)
      public ResponseEntity<Object> exception1(EmployeeNotFound exception1) {
	      return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	   }
	  @ExceptionHandler(value = Exception.class)
      public ResponseEntity<Object> exception2(Exception exception1) {
	      return new ResponseEntity<>("Exception occured", HttpStatus.NOT_FOUND);
	   }
}
