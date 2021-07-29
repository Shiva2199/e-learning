package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.CourseDAO;

import com.amdocs.training.dao.impl.CourseDaoImpl;

import com.amdocs.training.model.Course;

public class CourseController {
	public static void main(String a[]) {
	CourseDAO c_dao = new CourseDaoImpl();
	//c_dao.addCourse();
	Course c=new Course(0,"chem","organic chem","850","HcVerma");
	c_dao.updateCourse(c);
	//c_dao.deleteCourse();
	List<Course> courses = c_dao.findAll();
	if(courses.isEmpty()) {
		System.out.println("Empty Set");
	}
	else{
		System.out.println(courses);
	}
	
	}

}
