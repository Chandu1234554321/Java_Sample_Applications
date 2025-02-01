package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Payment;
@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer>{

}
