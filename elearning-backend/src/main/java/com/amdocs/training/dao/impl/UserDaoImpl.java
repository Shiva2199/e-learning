package com.amdocs.training.dao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.amdocs.training.DBUtils.DBUtils;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.model.User;

public class UserDaoImpl implements UserDAO {
	public Connection con;

	public UserDaoImpl() {
		con = DBUtils.getConnection();
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String query = "Select * from user";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				int user_id = rs.getInt("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				long phone_no = rs.getLong("phone_no");
				String reg_date = rs.getString("reg_date");
				String password = rs.getString("Password");
				long upload_photo = rs.getLong("upload_photo");
				users.add(new User(user_id, name, phone_no, email, address, reg_date, password, upload_photo));
			}
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String query = "insert into user(name,phone_no,email,address,reg_date,password,upload_photo) values(?,?,?,?,?,?,?)";
		// 'kiran',8754571547,'Kiran@123',
		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			/*
			 * System.out.print("Enter User User_id: "); int user_id =
			 * Integer.parseInt(br.readLine()); Pstmt.setInt(1, user_id); //
			 */
			// System.out.print("Enter User Name: ");
			// String name = br.readLine();
			Pstmt.setString(1, user.getName());
			// System.out.print("Enter User phone Number: ");
			// Long phone_no =Long.parseLong( br.readLine());
			Pstmt.setLong(2, user.getPhone());
			// System.out.print("Enter User Email : ");
			// String email = br.readLine();
			Pstmt.setString(3, user.getEmail());
			// System.out.print("Enter User Address : ");
			// String address = br.readLine();
			Pstmt.setString(4, user.getAddress());
			// System.out.print("Enter User Reg_date (dd/MM/yyyy): ");
			// String Reg_date = br.readLine();
			  
//		    SimpleDateFormat simpleformatter = new SimpleDateFormat("dd/MM/yyyy");  
//		    String strDate= simpleformatter.format(user.getReg_date()); 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			// convert String to LocalDate
			LocalDate localDate = LocalDate.parse(user.getReg_date(), formatter);
			Pstmt.setObject(5, localDate);
			// System.out.print("Enter User Password: ");
			// String password = br.readLine();
			Pstmt.setString(6, user.getPassword());
			// System.out.print("Enter User upload_photo: ");
			// Long upload_photo =Long.parseLong( br.readLine());
			Pstmt.setLong(7, user.getUpload_photo());

			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Employee Inserted Successfully!");
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
	public boolean deleteUser(int id) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Query = "Delete from user where user_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(Query);
			//System.out.print("Enter employee id :");
		//	int id = Integer.parseInt(br.readLine());
			Pstmt.setInt(1, id);
			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Employee Deleted Successfully!");
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
	public boolean updateUser(User user) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String query = "Update user set name=?,phone_no=?,email=?,address=?,reg_date=?,password=?,upload_photo=? where user_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			
			
			Pstmt.setString(1, user.getName());
			Pstmt.setLong(2, user.getPhone());
			Pstmt.setString(3, user.getEmail());
			Pstmt.setString(4, user.getAddress());
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
			LocalDate localDate = LocalDate.parse(user.getReg_date(), formatter);
			Pstmt.setObject(5, localDate);
			Pstmt.setString(6, user.getPassword());
			Pstmt.setLong(7, user.getUpload_photo());
			Pstmt.setInt(8, user.getId());
			int rows = Pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Updated Successfully");
				return true;
			} else {
				System.out.println("Try again");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User getUserById(int Id) {

		String query = "Select * from user where user_id=? ";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			Pstmt.setInt(1, Id);
			ResultSet rs = Pstmt.executeQuery();
			rs.next();
			int user_id = rs.getInt("user_id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String address = rs.getString("address");
			long phone_no = rs.getLong("phone_no");
			String reg_date = rs.getString("reg_date");
			String password = rs.getString("Password");
			long upload_photo = rs.getLong("upload_photo");
			User users = new User(user_id, name, phone_no, email, address, reg_date, password, upload_photo);

			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}



}
