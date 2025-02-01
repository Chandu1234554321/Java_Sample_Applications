package com.sample;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="a";
		
		System.out.println("#######convertedValue#######");
		System.out.println("#######convertedValue#######");
		System.out.println("#######convertedValue#######");
		System.out.println("#######convertedValue#######");
		
		try {
		
         int a[]=new int[4];
         
         a[5]=10;

		}
	    /*catch(NullPointerException ex)
	    {
	    	 System.out.println("################NullPointerException###############");
	    }
		catch(NumberFormatException ne)
		{
			 System.out.println("################NumberFormatException###############");
		}
		catch(Exception ne)
		{
			 System.out.println("################Exception###############");
		}*/
		finally
		{
			System.out.println("################finally###############");
		}
		
		
		   System.out.println("###############################");
	}

}
