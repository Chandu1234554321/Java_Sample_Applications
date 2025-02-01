
package com.example.security;

import java.io.Serializable;

import com.example.security.entiry.*;

    class SingleTonDesignExample
   {
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//GCF  single=GCF.readObject();
		
	    Class gcf=Class.forName("com.example.security.SingleTonEx");
		
		Class addr=Class.forName("com.example.security.entiry.Address");
		
		System.out.println("Addr Name#############3"+addr.getName());
		
		System.out.println("######GCF class Name#############3"+gcf.getName());
		
		//System.out.println("###############################"+single.hashCode());
	}
}