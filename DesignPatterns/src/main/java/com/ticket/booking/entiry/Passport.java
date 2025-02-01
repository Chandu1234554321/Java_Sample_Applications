package com.ticket.booking.entiry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport_info")
public class Passport {
	
	@Id
	private String passportNumber;
	
	private String issueLoc;

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getIssueLoc() {
		return issueLoc;
	}

	public void setIssueLoc(String issueLoc) {
		this.issueLoc = issueLoc;
	}
	
	
	

}
