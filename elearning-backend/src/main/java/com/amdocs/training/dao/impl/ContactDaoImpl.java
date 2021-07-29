package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.amdocs.training.DBUtils.DBUtils;
import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.model.Contact;
import com.amdocs.training.model.Feedback;

public class ContactDaoImpl implements ContactDAO {
	public Connection con;

	public ContactDaoImpl() {
		con = DBUtils.getConnection();
	}

	@Override
	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<Contact>();
		String query = "Select * from contact";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				int user_id = rs.getInt("user_id");
				String name = rs.getString("name");
				String Email = rs.getString("Email");
				long phone_no = rs.getLong("Phone_no");
				String messege = rs.getString("messege");
				int contact_id = rs.getInt("contact_id");
				contacts.add(new Contact(user_id, name, Email, phone_no, messege, contact_id));
			}
			return contacts;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean addContact(Contact contact) {

		String query = "insert into contact(user_id,name,email,phone_no,messege,contact_id) values(?,?,?,?,?,?)";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);

			Pstmt.setInt(1, contact.getUserId());

			Pstmt.setString(2, contact.getName());

			Pstmt.setObject(3, contact.getEmail());

			Pstmt.setLong(4, contact.getPhoneNo());

			Pstmt.setString(5, contact.getMessege());

			Pstmt.setInt(6, contact.getContactId());

			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Contact Inserted Successfully!");
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
	public boolean deleteContact(int contact_id) {

		String Query = "Delete from contact where user_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(Query);

			Pstmt.setInt(1, contact_id);
			int rowCount = Pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Contact Deleted Successfully!");
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
	public boolean updateContact(Contact contact) {

		String query = "Update contact set name=?,Email=?,Phone_no=?,Messege=?,contact_id=? where user_id=?";
		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			;
			Pstmt.setString(1, contact.getName());

			Pstmt.setString(2, contact.getEmail());

			Pstmt.setLong(3, contact.getPhoneNo());
			
			Pstmt.setString(4, contact.getMessege());
			
			Pstmt.setInt(5, contact.getContactId());
			
			Pstmt.setInt(6, contact.getUserId());

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
	public Contact getContactById(int contact_id) {
		String query = "Select * from contact where contact_id=? ";

		try {
			PreparedStatement Pstmt = con.prepareStatement(query);
			Pstmt.setInt(1, contact_id);
			ResultSet rs = Pstmt.executeQuery();
			rs.next();
			int user_id = rs.getInt("user_id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			long phone = rs.getLong("phone_no");
			String messege = rs.getString("messege");
			int id = rs.getInt("contact_id");
			Contact contact=new Contact(user_id, name, email, phone, messege,id);

			return contact;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
