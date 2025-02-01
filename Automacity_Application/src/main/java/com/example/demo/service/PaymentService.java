package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Payment;
import com.example.demo.bean.Product;
import com.example.demo.repo.PaymentRepository;
import com.example.demo.repo.ProductRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	@Autowired
	private ProductRepository  productRepo;
	
	
	@Transactional(rollbackOn = Exception.class)
	public void saveData(Product product,Payment payment)
	{
		paymentRepo.save(payment);
		
		//int i =10/0;
		
		productRepo.save(product);
		
		
		
	}

}
