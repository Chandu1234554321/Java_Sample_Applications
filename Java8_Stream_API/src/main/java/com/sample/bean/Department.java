package com.sample.bean;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private Integer deptId;
	
	private String deptName;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public void display()
	{
		System.out.println("###########Department created successfully!############");
	}

}
