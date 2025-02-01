package com.sample.bean;

import java.util.ArrayList;
import java.util.List;

public class Student_DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department dept=new Department();
		
		dept.setDeptId(100);
		dept.setDeptName("Admin");
		Department dept1=new Department();
		dept1.setDeptId(200);
		dept1.setDeptName("Service");
		
		List<Department> departmentList = new ArrayList<Department>();
		
		departmentList.add(dept);departmentList.add(dept1);
		
		List<Student> studentList = new ArrayList<Student>();
		
		Student s=new Student();
		
		

	}

}
