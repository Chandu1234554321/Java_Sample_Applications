package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.persistence.Embeddable;

@Embeddable
public class CourseComposite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer courseId;
	
	private String courseName;
 
	public Integer getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
