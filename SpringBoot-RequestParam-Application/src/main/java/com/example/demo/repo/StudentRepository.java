package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Student;
import com.example.demo.bean.StudentCompositor;

public interface  StudentRepository extends JpaRepository<Student, StudentCompositor> {

}
