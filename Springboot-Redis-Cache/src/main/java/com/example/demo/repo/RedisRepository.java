package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public interface RedisRepository extends JpaRepository<Employee,Integer> {

}
