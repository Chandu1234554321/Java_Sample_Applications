package com.sample;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternizableExample implements Externalizable {

	private String name;
	
	private double sal;
	
	private int age; 
	
	public ExternizableExample()
	{
		
	}
	public ExternizableExample(String name,
	 double sal,
	 int age)
	{
		this.name=name; this.sal=sal; this.age=age;
		
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeObject(name);
		out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 name = (String)in.readObject();
	     // Reading age from file
	     age = in.readInt();
	}
	
	public static void main(String a[]) throws IOException
	{
		ExternizableExample  exter=new ExternizableExample("Somesh",25,1000000);
		
		FileOutputStream     output=new FileOutputStream("abc.ser");
		
		ObjectOutputStream   outObj=new ObjectOutputStream(output);
		
		outObj.writeObject(exter);
		
		FileInputStream  input=new FileInputStream("abc.ser");
		
		ObjectInputStream  inputObj=new ObjectInputStream(input);
		
		try {
			ExternizableExample  exterObj=(ExternizableExample) inputObj.readObject();
			
			System.out.println("########Name###############"+exterObj.name+ "##########Age############" +exterObj.age);
		    System.out.println(exterObj.sal);
		   
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
