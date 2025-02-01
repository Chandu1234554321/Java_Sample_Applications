package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseComposite;
import com.example.demo.entity.Employee;
import com.example.demo.repo.CourseRepo;
import com.example.demo.repo.EmployeeRepo;

@SpringBootApplication
public class CompositePrimaryKeyAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  context=SpringApplication.run(CompositePrimaryKeyAppApplication.class, args);
	    CourseRepo repo=context.getBean(CourseRepo.class);
	    Course course=new Course();
	    CourseComposite  courseComposite=new CourseComposite();
	    courseComposite.setCourseId(800);
	    courseComposite.setCourseName("Java");
	    course.setCourseComposite(courseComposite);
	    course.setCourseDuration(2);
	    course.setCourseCost(1000.0);
	    
	   
	    
	    repo.save(course);
	   // repo.save(course);
	    
	    EmployeeRepo empRepo=context.getBean(EmployeeRepo.class);
	    
	    Employee emp=new Employee();
	    
	    emp.setEmpName("chandu");emp.setEmpLocation("Bangalore");
	    
	    empRepo.save(emp);
	    
	    
	
	}

}
