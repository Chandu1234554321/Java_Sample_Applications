package com.example.security.entiry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Female {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer femaleId;
	
	private String femaleName;
	
	private String femaleAddr;
	
	private Integer age;

	public Integer getFemaleId() {
		return femaleId;
	}

	public void setFemaleId(Integer femaleId) {
		this.femaleId = femaleId;
	}

	public String getFemaleName() {
		return femaleName;
	}

	public void setFemaleName(String femaleName) {
		this.femaleName = femaleName;
	}

	public String getFemaleAddr() {
		return femaleAddr;
	}

	public void setFemaleAddr(String femaleAddr) {
		this.femaleAddr = femaleAddr;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
