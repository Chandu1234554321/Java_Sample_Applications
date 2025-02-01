package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeeinfo")
public class Employee {
	
	@Id
	@GenericGenerator(name="test" ,strategy="com.example.demo.entity.OrderIdGenarator")
	@GeneratedValue(generator="test")
	private String empId;
	
	private String empName;
	
	private String empLocation;

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
	

}
