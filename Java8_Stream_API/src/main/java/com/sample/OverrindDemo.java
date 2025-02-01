package com.sample;

  class Parent {
	
	public void mone()
	{
		System.out.println("###########mone()#################");
	}
	public void mtwo()
	{
		System.out.println("###########mtwo()#################");
	}
}

class Child extends Parent
{
	public void mone()
	{
		System.out.println("###########moneChild()#################");
	}
	
	
	
}

public class OverrindDemo
{
	public static void main( String a[])
	{
		Child c=new Child();
		
		Parent p=new Child();
		
		p.mone();
		
		
		
	
     }
}
