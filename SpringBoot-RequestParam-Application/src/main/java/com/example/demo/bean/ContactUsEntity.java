package com.example.demo.bean;


import java.time.LocalDate;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contactdetails")
public class ContactUsEntity {
	
	@Id
	@GenericGenerator(name="order_id_seq" ,strategy = "com.example.demo.bean.OrderIdGenarator")
	@GeneratedValue(generator = "order_id_seq")
	
	private String cid;
	
	private String cname;
	
	@UpdateTimestamp
	@Column(name="updatedate")
	private LocalDate updateDate;
	
	@CreationTimestamp
	@Column(name="currentdate",updatable  = false)
	private LocalDate currentDate;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate date) {
		this.updateDate = date;
	}

	public LocalDate getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	
	

}
