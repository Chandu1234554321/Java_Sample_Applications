package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseComposite;

public interface CourseRepo extends JpaRepository<Course,CourseComposite>{
	
}
