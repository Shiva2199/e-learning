package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDaoImpl;
import com.amdocs.training.model.Admin;

public class AdminController {

	public static void main(String[] args) {
		AdminDAO dao = new AdminDaoImpl();
		// dao.addAdmin();
		// dao.updateAdmin();
		// dao.deleteAdmin();
		List<Admin> admin = dao.findAll();
		if (admin.isEmpty()) {
			System.out.println("Empty set!");

		} else {
			admin.forEach(System.out::println);
		}

	}

}
