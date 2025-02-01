package com.ticket.booking.designpatterns;

public class Context {
	
	private Stratagy  stratagy;
	
	public Context(Stratagy  stratagy)
	{
		this.stratagy=stratagy;
	}
	public int executeStratagy(int n1,int n2)
	{
		return stratagy.doOperation(n1, n2);
	}

}
