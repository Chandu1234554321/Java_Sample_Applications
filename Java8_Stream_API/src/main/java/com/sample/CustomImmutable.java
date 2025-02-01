package com.sample;

import java.util.List;

 final class  CustomTest {  //class id final no body extend

	private final int custId;   //members are private .direct access not possible and final con't chnage value
	
	private final String custName;
	
	private final  Address address;
	
	public CustomTest(int custId,String custName, Address address) //assign the values 
	{
		this.custId=custId;
		this.custName=custName;	
		this.address=address;
	}
	public int getCustId() {
		return custId;  // get the values
	}
	public String getCustName() {
		return custName;
	}
	public Address  getAddress() throws CloneNotSupportedException {
		Address addr=new Address();
		addr.setLocation(address.getLocation());
		addr.setStreetNo(address.getStreetNo());
		
		return addr;
	}
}

class Address
{
	int streetNo;
	
	String location;
	
	public Address()
	{
		
	}
	
	public Address(int i, String string)
	{
		this.streetNo=streetNo
				;
		this.location=location;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
public class CustomImmutable 
{
	public static void main(String a[]) throws CloneNotSupportedException
	{
		CustomTest  cust=new CustomTest(100, "ChandraSekhar",new Address(123,"Chennai"));	
		Address addr=cust.getAddress();
	    String loc= addr.getLocation();
	    System.out.println("###########LOC###############"+loc);
	    addr.setLocation("Hyd");
	    String loc1= addr.getLocation();
	    System.out.println("###########loc1###############"+loc1);
		
	}
}