package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Admin;

public interface AdminDAO {
	List<Admin> findAll();

	boolean addAdmin(Admin admin);

	boolean deleteAdmin(int admin_id);

	boolean updateAdmin(Admin admin);
	
	Admin getAdminById(int admin_id);
//	List<User> findAll();
//	void deleteUser(int id);
//	void updateUser(User user);
//	void addUser(User user);
//	User getUserById(int Id);
}
