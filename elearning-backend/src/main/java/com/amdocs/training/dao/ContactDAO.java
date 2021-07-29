package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Contact;



public interface ContactDAO {
	List<Contact> findAll();
	boolean addContact(Contact contact);
	boolean deleteContact(int contact_id);
	boolean updateContact(Contact contact);
	Contact getContactById(int contact_id);
//	List<User> findAll();
//	void deleteUser(int id);
//	void updateUser(User user);
//	void addUser(User user);
//	User getUserById(int Id);
}
