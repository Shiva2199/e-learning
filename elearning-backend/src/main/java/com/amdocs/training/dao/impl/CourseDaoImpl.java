package com.amdocs.training.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.DBUtils.DBUtils;
import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.model.Contact;
import com.amdocs.training.model.Course;

public class CourseDaoImpl implements CourseDAO{
	public Connection con;

	public CourseDaoImpl() {
		con = DBUtils.getConnection();
	}

	@Override
	public List<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		String query = "Select * from course";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				int user_id = rs.getInt("course_id");
				String name = rs.getString("c_name");
				String Email = rs.getString("c_desp");
				String c_fees = rs.getString("c_fees");
				String c_resource = rs.getString("c_resource");
				courses.add(new Course(user_id, name, Email, c_fees, c_resource));
			}
			return courses;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean addCourse(Course course) {
		
		String query = "insert into course(course_id, c_name,c_desp , c_fees ,c_resource) values(?,?,?,?,?)";
		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
		
			Pstmt.setInt(1,course.getCourseId());
			
			Pstmt.setString(2, course.getCourseName());
			
			Pstmt.setObject(3, course.getCourseDesp());
			
			Pstmt.setString(4, course.getCourseFees());
			
			Pstmt.setString(5, course.getCourseResources());

			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("course Inserted Successfully!");
				return true;
			} else {
				System.out.println("Try again!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public boolean deleteCourse(int course_id) {
		String Query = "Delete from course where course_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(Query);
			Pstmt.setInt(1, course_id);
			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Course Deleted Successfully!");
				return true;

			} else {
				System.out.println("Try again!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateCourse(Course course){
		
		String query ="Update course set c_name=?,c_desp=?,c_fees=?,c_resource=? where course_id=?";
		try {
			
			PreparedStatement Pstmt=con.prepareStatement(query);
			Pstmt.setString(1, course.getCourseName());
			Pstmt.setString(2, course.getCourseDesp());
			Pstmt.setString(3, course.getCourseFees());
			Pstmt.setString(4, course.getCourseResources());
			Pstmt.setInt(5, course.getCourseId());
			
			int rows=Pstmt.executeUpdate();
			if(rows>0) {
				System.out.println("Updated Successfully");
				return true;
			}
			else {
				System.out.println("Try again");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return false;
	}

	@Override
	public Course getCourseById(int course_id) {
		String query = "Select * from Course where course_id=? ";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			Pstmt.setInt(1, course_id);
			ResultSet rs = Pstmt.executeQuery();
			rs.next();
			int id = rs.getInt("course_id");
			String name = rs.getString("c_name");
			String email = rs.getString("c_desp");
			String fees = rs.getString("c_fees");
			String resource = rs.getString("c_resource");
			
			Course course=new Course(id, name, email, fees, resource);

			return course;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}


}
