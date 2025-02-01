package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Employee {
	
	@Id
	@Column(name="employeeid")
	private Integer empId;
	@Column(name="employeename")
	private String empName;
	@Column(name="employeesalary")
	private Double salary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
