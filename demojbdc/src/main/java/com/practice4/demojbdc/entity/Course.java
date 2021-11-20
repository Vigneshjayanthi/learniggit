package com.practice4.demojbdc.entity;

import org.springframework.data.annotation.Id;


public class Course {
	private int courseid;
	private String courseName;
	public Course(int courseid, String courseName) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + "]";
	}
	
	
	
	
	

}
