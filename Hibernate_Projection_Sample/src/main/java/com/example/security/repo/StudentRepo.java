package com.example.security.repo;

import com.example.security.entiry.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
 
public interface StudentRepo extends CrudRepository<Student, Integer> {
 
}