
package com.example.security.entiry;
import javax.persistence.*;
 
@Entity
//Adding the table name
@Table(name = "address")
public class Address {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int housenumber;
	
   	@Column(name="streetname")
    private String streetName;
	
	@Column(name="cityname")
	private String cityName;
	

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
  

	 

}