package com.example.demo.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	Integer prodId;
	
	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDate getProdStartDate() {
		return prodStartDate;
	}

	public void setProdStartDate(LocalDate prodStartDate) {
		this.prodStartDate = prodStartDate;
	}

	public LocalDate getProdEndDate() {
		return prodEndDate;
	}

	public void setProdEndDate(LocalDate prodEndDate) {
		this.prodEndDate = prodEndDate;
	}

    @Column(name="prod_name")
	private String  prodName;
	
	@Column(name="price")
    private Double  price;
	
	@Column(name="quantity")
	private Integer quantity;
	
    private LocalDate prodStartDate;
    
    private LocalDate prodEndDate;
    
    
	
	
	

}
