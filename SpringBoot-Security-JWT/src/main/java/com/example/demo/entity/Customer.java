package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	
	@Id
	private Integer custId;
	
	public Integer getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getPassword() {
		return password;		
	}

	public Long getPhone() {
		return phone;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	private  String custName;
	
	private String password;
	
	private Long phone;

}
