package com.amdocs.training.model;

public class Course {
	private int courseId;
	private String courseName;
	private String courseDesp;
	private String courseFees;
	private String courseResources;

	public Course() {
		
	}
	public Course(int courseId, String courseName, String courseDesp, String courseFees, String courseResources) {
		// TODO Auto-generated constructor stub
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesp = courseDesp;
		this.courseFees = courseFees;
		this.courseResources = courseResources;
	}
	public int getCourseId() {
		return this.courseId;
	}
	public String getCourseName() {
		return this.courseName;
	}
	public String getCourseDesp() {
		return this.courseDesp;
	}
	public String getCourseFees() {
		return this.courseFees;
	}
	public String getCourseResources() {
		return this.courseResources;
	}
	public void setCourseId(int courseId) {
		this.courseId=courseId;
	}
	public void setCourseName(String courseName) {
		 this.courseName=courseName;
	}
	public void setCourseDesp(String courseDesp) {
		 this.courseDesp=courseDesp;
	}
	public void setCourseFees(String courseFees) {
		this.courseFees=courseFees;
	}
	public void setCourseResources(String courseResources) {
		this.courseResources=courseResources;
	}
	

	public String toString() {
		return (" Course Id : " + this.courseId + " Course Name : " + this.courseName + " Course Name: "
				+ " Course Description :" + this.courseDesp + " Course fees " + this.courseFees + " Course Resources"
				+ this.courseResources);
	}
}
