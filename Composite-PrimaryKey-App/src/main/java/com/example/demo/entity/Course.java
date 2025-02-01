package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="courseinfo")
public class Course {
	

	@Id
	private CourseComposite courseComposite;
	
	private Integer courseDuration;
	
	private Double courseCost;

	public CourseComposite getCourseComposite() {
		return courseComposite;
	}

	public Integer getCourseDuration() {
		return courseDuration;
	}

	public Double getCourseCost() {
		return courseCost;
	}

	public void setCourseComposite(CourseComposite courseComposite) {
		this.courseComposite = courseComposite;
	}

	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

	public void setCourseCost(Double courseCost) {
		this.courseCost = courseCost;
	}
}
