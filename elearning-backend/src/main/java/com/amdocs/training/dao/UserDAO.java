package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.User;
public interface UserDAO{
	
	List<User> findAll();
	boolean deleteUser(int id);
	boolean updateUser(User user);
	boolean addUser(User user);
	User getUserById(int Id);

}
