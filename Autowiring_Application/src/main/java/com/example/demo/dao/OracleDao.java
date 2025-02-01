package com.example.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleDao implements UserDao{
	
	
	 public String getName(int number)
		{
	    	
	    	if(number==100)
	    	{
	    		return " Oracle Chandrasekhar";
	    	}
	    	else if(number==200)
	    	{
	    		return " Oracle Somesh";
	    	}
	    	else return "SomaSekhar";
		}

}
