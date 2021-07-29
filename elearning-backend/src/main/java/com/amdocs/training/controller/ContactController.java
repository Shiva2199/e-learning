package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDaoImpl;
import com.amdocs.training.model.Contact;

public class ContactController {

	public static void main(String[] args) {
		ContactDAO dao = new ContactDaoImpl();
		// dao.addContact();
		// dao.updateContact();
		//dao.deleteContact();
		
		Contact contact=new Contact(112,"Suhith","suhith@gmail.com",8484187,"Hello Namastey",1);
		dao.updateContact(contact);
//		List<Contact> contacts = dao.findAll();
//		if (contacts.isEmpty()) {
//			System.out.println("Empty set!");
//		} else {
//			contacts.forEach(System.out::println);
//		}
	}

}
