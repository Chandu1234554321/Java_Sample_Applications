package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer courseId;
	private String  courseName;
	private Integer duration;
	private String activeSW;
	public String getActiveSW() {
		return activeSW;
	}
	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	
	

}
