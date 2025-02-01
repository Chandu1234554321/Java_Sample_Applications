package com.ticket.booking.designpatterns;

import java.util.HashMap;
import java.util.Map;

//Custom immutable class
public final class ImmutableTest {
	
	private final int Id;
	
	private  String name;
	
	Map map=new HashMap();
	
	public  ImmutableTest(int Id,String name) {
	
	
		this.Id=Id;
		this.name=name;
	}
	public int getId()
	{

		return Id;
	}
	
	public static void main(String a[])
	{
		ImmutableTest  test=new ImmutableTest(100, "Chandu");
		
	}
	

}
