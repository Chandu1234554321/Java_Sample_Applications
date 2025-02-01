package com.ticket.booking;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonEx implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private static SingleTonEx instance2=null;
	
	private SingleTonEx()
	{
		//Private Constructor
	}
	
		
	static {
		
            Constructor[] constructors
                            = SingleTonEx.class.getDeclaredConstructors();
         for (Constructor constructor : constructors) {
             // Below code will destroy the singleton
             // pattern
             constructor.setAccessible(false);
             try {
				instance2
				     = (SingleTonEx)constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// what
				e.printStackTrace();
			}
             break;
          }
    	}

		@Override
		protected Object clone() throws CloneNotSupportedException
		{
			return super.clone();
		}
		 protected Object readResolve()
		{
			return instance2;
		}
		public static SingleTonEx readObject()
		{
			if(instance2 == null)
			{
				return new SingleTonEx();
			}
			return instance2;
			
		  }
    }
