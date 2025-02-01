package com.ticket.booking.designpatterns;

public class StratagyApplication {
	
	public static void main(String a[])
	{
		Context  context=new Context(new OperationAdd());	
		System.out.println("Addition :: "+context.executeStratagy(1, 30));
		
		context=new Context(new OperationMul());
		System.out.println("Multiplication :: "+context.executeStratagy(23, 10));
	}

}
