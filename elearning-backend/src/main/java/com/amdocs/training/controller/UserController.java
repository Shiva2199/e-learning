package com.amdocs.training.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDaoImpl;
import com.amdocs.training.model.User;

public class UserController {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter User User_id by default user id is auto increment : ");
		int user_id = Integer.parseInt(br.readLine());
		
		System.out.print("Enter User Name: ");
		String name = br.readLine();
		
		System.out.print("Enter User phone Number: ");
		Long phone_no =Long.parseLong( br.readLine());
		
		System.out.print("Enter User Email : ");
		String email = br.readLine();
		
		System.out.print("Enter User Address : ");
		String address = br.readLine();
		System.out.print("Enter User Reg_date (dd/MM/yyyy): ");
		String Reg_date = br.readLine();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		//convert String to LocalDate
		//LocalDate localDate = LocalDate.parse(Reg_date, formatter); 
		
		System.out.print("Enter User Password: ");
		String password = br.readLine();
		
		System.out.print("Enter User upload_photo: ");
		Long upload_photo =Long.parseLong( br.readLine());
		User  user=new User(user_id, name, phone_no,email,address,Reg_date, password, upload_photo);

		UserDAO Dao=new UserDaoImpl();
		Dao.updateUser(user);
//		System.out.println(Dao.addUser(new_user));
//		List<User> user = Dao.findAll();
//		if (user.isEmpty()) {
//			System.out.println("Empty set!");
//		} else {
//			user.forEach(System.out::println);
//		}
		//Dao.deleteUser();
		//Dao.updateUser();
		
	}

}
