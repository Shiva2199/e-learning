package com.amdocs.training.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.amdocs.training.DBUtils.DBUtils;
import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.model.Feedback;


public class FeedbackDaoImpl implements FeedbackDAO {

	public Connection con;

	public FeedbackDaoImpl() {
		con = DBUtils.getConnection();
	}

	@Override
	public List<Feedback> findAll() {
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		String query = "Select * from feedback";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				int user_id = rs.getInt("user_id");
				String name = rs.getString("name");
				String Email = rs.getString("Email");
				int f_id = rs.getInt("f_id");
				String feedback = rs.getString("feedback");
				feedbacks.add(new Feedback(user_id, name, Email, f_id, feedback));
			}
			return feedbacks;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean addfeedback(Feedback feedback) {
		
		String query = "insert into feedback(user_id,name,email,f_id,feedback) values(?,?,?,?,?)";
		// 
		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			
			Pstmt.setInt(1, feedback.getfeedbackUserId());
			
			Pstmt.setString(2, feedback.getfeedbackName());
			
			Pstmt.setObject(3, feedback.getfeedbackEmail());
			
			Pstmt.setLong(4, feedback.getfeedbackId());
			
			Pstmt.setString(5, feedback.getfeedback());

			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("feedback Inserted Successfully!");
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
	public boolean deletefeedback(int UserId) {
		
		String Query = "Delete from feedback where user_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(Query);
			
			Pstmt.setInt(1, UserId);
			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("feedback Deleted Successfully!");
				return true;

			} else {
				System.out.println("Try again!");
			}

		} catch (SQLException | NumberFormatException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean  updatefeedback(Feedback feedback) {
		
		String query ="Update feedback set name=?,email=?,f_id=?,feedback=? where user_id=?";
		try {
			PreparedStatement Pstmt=con.prepareStatement(query);
			
			
			Pstmt.setString(1, feedback.getfeedbackName());
			Pstmt.setString(2, feedback.getfeedbackEmail());
			Pstmt.setInt(3, feedback.getfeedbackId());
			Pstmt.setString(4, feedback.getfeedback());
			Pstmt.setInt(5, feedback.getfeedbackUserId());
			int rows=Pstmt.executeUpdate();
			if(rows>0) {
				System.out.println("Updated Successfully");
				return true;
			}
			else {
				System.out.println("Try again");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Feedback getFeedbackById(int f_id) {
		String query = "Select * from feedback where f_id=? ";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			Pstmt.setInt(1, f_id);
			ResultSet rs = Pstmt.executeQuery();
			rs.next();
			int user_id = rs.getInt("user_id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			int feedback_id = rs.getInt("f_id");
			String feed_back = rs.getString("feedback");
			Feedback feedback=new Feedback(user_id, name, email, feedback_id, feed_back);

			return feedback;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
