package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
