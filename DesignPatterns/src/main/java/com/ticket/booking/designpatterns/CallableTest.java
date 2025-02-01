package com.ticket.booking.designpatterns;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stubarr
		int arr1[]= {1,2,3,};
		
		System.out.println("#######ArrayLength#######"+arr1.length);
		
		ExecutorService service=Executors.newFixedThreadPool(2);
		Future<String> msg=service.submit(new CallableTest());
		
		System.out.println(msg.get());

	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "Hellow Callable";
	}

}
