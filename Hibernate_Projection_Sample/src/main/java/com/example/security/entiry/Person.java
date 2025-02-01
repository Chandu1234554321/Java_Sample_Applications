package com.example.security.entiry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	private Integer personId;
	
	private String  personName;
	
	private String  personAddr;
	
	@OneToOne
	@JoinColumn(name="person_passport",referencedColumnName = "passportNumber")
	private Passport passInfo;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Passport getPassInfo() {
		return passInfo;
	}

	public void setPassInfo(Passport passInfo) {
		this.passInfo = passInfo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonAddr() {
		return personAddr;
	}

	public void setPersonAddr(String personAddr) {
		this.personAddr = personAddr;
	}
	
	
	
	
	
}
