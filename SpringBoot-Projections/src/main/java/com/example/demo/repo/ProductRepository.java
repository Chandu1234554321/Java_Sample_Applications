package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.bean.Product;
import com.example.demo.bean.ProductRepo;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value="selectp roduct_name,price,quantiry from product",nativeQuery=true)
	public List<ProductRepo>  getProductWithAttributes();
	
	
}
