package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Course;

import java.util.*;
import java.util.List;


public interface CourseRepository extends CrudRepository<Course, Integer> {
	
	public List<Course> findByActiveSW(String status);
	
	public Course findByCourseId(Integer courseId);

}
