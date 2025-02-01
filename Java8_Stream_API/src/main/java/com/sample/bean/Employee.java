package com.sample.bean;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Comparable<Employee>{

	private Integer empId;
	
	private String empName;
	
	private String emailId;
	
	private Double sal;
	
	private String dept;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Employee(Integer empId, String empName, String emailId,Double sal,String dept)
	{
		this.empId=empId;
		this.empName=empName;
		this.emailId=emailId;
		this.sal=sal;
		this.dept=dept;
	}
	@Autowired
	Employee(Department department)
	{
	   this.department=department;	
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private Department department;

	public Department getDepartment() {
		return department;
	}
 	public void setDepartment(Department department) {
		this.department = department;
	}

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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public void display()
	{
		System.out.println("Employee created successfully!");
		department.display();
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empId==o.getEmpId())
		{
			return this.empName.compareTo(o.getEmpName());
		}else if(this.empId>o.getEmpId())
		{
			return 1;
		}
		else
			return -1;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, dept, emailId, empId, empName, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(dept, other.dept)
				&& Objects.equals(emailId, other.emailId) && Objects.equals(empId, other.empId)
				&& Objects.equals(empName, other.empName) && Objects.equals(sal, other.sal);
	}
}
