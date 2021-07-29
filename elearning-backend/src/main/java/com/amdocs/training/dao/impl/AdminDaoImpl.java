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
import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.model.Admin;
import com.amdocs.training.model.User;

public class AdminDaoImpl implements AdminDAO {
	public Connection con;

	public AdminDaoImpl() {
		con = DBUtils.getConnection();
	}

	@Override
	public List<Admin> findAll() {
		List<Admin> admins = new ArrayList<Admin>();
		String query = "Select * from admin";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				int admin_id = rs.getInt("admin_id");
				String name = rs.getString("name");
				String Email = rs.getString("Email");
				String Password = rs.getString("password");
				admins.add(new Admin(admin_id, name, Email, Password));
			}
			return admins;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean addAdmin(Admin admin) {

		String query = "insert into admin(admin_id,name,email,password) values(?,?,?,?)";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);

			Pstmt.setInt(1, admin.getAdminId());

			Pstmt.setString(2, admin.getName());

			Pstmt.setObject(3, admin.getEmail());

			Pstmt.setString(4, admin.getPassword());

			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Admin Inserted Successfully!");
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
	public boolean deleteAdmin(int admin_id) {

		String Query = "Delete from admin where admin_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(Query);
			Pstmt.setInt(1, admin_id);
			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Admin Deleted Successfully!");
				return true;
			} else {
				System.out.println("Try again!");
			}

		} catch (SQLException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateAdmin(Admin admin) {

		String query = "Update admin set name=?,email=?,password=? where admin_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(query);

			Pstmt.setString(1, admin.getName());

			Pstmt.setString(2, admin.getEmail());

			Pstmt.setString(3, admin.getPassword());

			Pstmt.setInt(4, admin.getAdminId());

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
	public Admin getAdminById(int admin_id) {
		String query = "Select * from admin where admin_id=? ";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			Pstmt.setInt(1, admin_id);
			ResultSet rs = Pstmt.executeQuery();
			rs.next();
			int id = rs.getInt("admin_id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String password = rs.getString("Password");
			Admin admin = new Admin(id, name, email, password);
			return admin;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
