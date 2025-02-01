package com.sample;

import java.util.ArrayList;

public class ThrowThrowsExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String user;
		
		try {
         testing();
		}
		catch(Exception e) {}
		
		div(1,0);
		
		
		 System.out.println("###############3");
	}
	
	public static void testing() throws InterruptedException
	{
		Thread.sleep(100);
	}
	public static int div(int a,int b)throws ArithmeticException
	{
		int c=0;
		
		  //Databased connetions;
		
		   // Ollections;
		
		  ArrayList list=new ArrayList();
		  
		   
		   try {
		
			 c=a/b;
		   }
		  
		   catch(ArithmeticException ex)
		   {
			   
		   }
		   catch(Exception ex)
		   {
			   
		   }
		   finally
		   {
			   //collection=null;
			   
			 ///  list =null;
		   }
		   
		
			 System.out.println("###############3");
		
		
		return c;
		
	}

}
