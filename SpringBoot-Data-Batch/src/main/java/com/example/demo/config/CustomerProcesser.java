package com.example.demo.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.bean.Customer;

public class CustomerProcesser implements ItemProcessor<Customer,Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
	
		return item;
	}


}
