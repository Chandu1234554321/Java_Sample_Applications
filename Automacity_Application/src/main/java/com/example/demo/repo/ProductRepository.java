package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>  {

}
