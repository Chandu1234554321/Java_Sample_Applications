package com.sample;

import java.io.Serializable;

public class SingletonTest {
	
	public static void main(String a[])
	{
	//	Employee e =(Employee) Employee.readResolve();
		
		//System.out.println(e.hashCode());
		
		//Employee e1 =(Employee) Employee.readResolve();
		
		//System.out.println(e1.hashCode());
	}

}
/*class Employee implements Serializable
{
	private static Employee employee;
	
	    @Override
	    protected Object clone()
	        throws CloneNotSupportedException
	    {
	        throw new CloneNotSupportedException();
	    }

	private Employee()
	{
		
	}
	public static Object readResolve()
	{	
		if(employee==null)
		{    
			synchronized(Employee.class)
			{
				if(employee==null)
				{ 
					employee=new Employee();
				}
			}
		}
		return employee;
	}
	*/
	
