package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Course;

public interface CourseDAO {
	List<Course> findAll();

	boolean addCourse(Course course);

	boolean deleteCourse(int course_id);

	boolean updateCourse(Course course);
	
	Course getCourseById(int course_id);
//	List<User> findAll();
//	void deleteUser(int id);
//	void updateUser(User user);
//	void addUser(User user);
//	User getUserById(int Id);
}
