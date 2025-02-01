package com.ticket.booking.designpatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	     System.out.println("###RUN MEthod###########");
	}
	
	public static void main(String a[])
	{
       ExecutorService service=Executors.newFixedThreadPool(2);
       
       service.submit(new RunnableTest());
		
		Thread t =new Thread(new RunnableTest());
		
		t.start();
	}

}
