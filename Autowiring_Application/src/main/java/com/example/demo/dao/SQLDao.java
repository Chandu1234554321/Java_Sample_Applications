package com.example.demo.dao;

import org.springframework.stereotype.Component;

@Component("sql")
public class SQLDao implements UserDao {
	
	 public String getName(int number)
		{
	    	if(number==100)
	    	{
	    		return "SQL Chandrasekhar";
	    	}
	    	else if(number==200)
	    	{
	    		return "SQL Somesh";
	    	}
	    	else return "Sql SomaSekhar";
		}

}
