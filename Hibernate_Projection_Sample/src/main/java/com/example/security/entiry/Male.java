package com.example.security.entiry;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Male {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maleId;
	
	private String malaeName;
	
	private String maleAddr;
	
	private Integer age;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_fm_number" , referencedColumnName = "femaleId")
	private Female female;

	public Female getFemale() {
		return female;
	}

	public void setFemale(Female female) {
		this.female = female;
	}

	public Integer getMaleId() {
		return maleId;
	}

	public void setMaleId(Integer maleId) {
		this.maleId = maleId;
	}

	public String getMalaeName() {
		return malaeName;
	}

	public void setMalaeName(String malaeName) {
		this.malaeName = malaeName;
	}

	public String getMaleAddr() {
		return maleAddr;
	}

	public void setMaleAddr(String maleAddr) {
		this.maleAddr = maleAddr;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
