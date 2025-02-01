package com.howtodoinjava.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  
  public Employee()
  {
	  
  }
  
  public Employee(Long id,String firstName,String lastName,String email)
  {
	  this.id=id;
	  this.firstName=firstName;
	  this.lastName=lastName;
	  this.email=email;
	  
  }
}
