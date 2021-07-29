package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.authentication.Login;
import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDaoImpl;
import com.amdocs.training.model.Admin;
import com.amdocs.training.model.User;



@Controller
public class AdminController {

	AdminDAO dao = new AdminDaoImpl();
	@GetMapping("/adminloginpage")
	public String adminloginPage() {
		
		return "AdminLoginpage";
	}

	@GetMapping("/admin-list")
	public String adminPage(Model model) {
		List<Admin> adminList = dao.findAll();
		model.addAttribute("list", adminList);
		return "admin";
	}

	@GetMapping("/addAdmin")
	public String addAdminForm(Model model) {
		model.addAttribute("admin", new Admin());
		return "add-Admin";
	}

	@PostMapping("/register-admin")
	public String addAdmin(@ModelAttribute("admin") Admin a) {
		dao.addAdmin(a);
		return "redirect:/admin-list";
	}
	@GetMapping("/delete-admin/{id}")
	public String deleteAdmin(@PathVariable("id") int id) {
		dao.deleteAdmin(id);
		return "redirect:/admin-list";
	}
	@GetMapping("/update-admin/{id}")
	public String updateAdminForm(@PathVariable("id") int id,Model model) {
		Admin admin=dao.getAdminById(id);
		model.addAttribute("admin",admin);
		return "update-admin";
	}
	@PostMapping("/update-admin")
	public String updateAdmin(@ModelAttribute("admin") Admin a) {
		
		dao.updateAdmin(a);
		return "redirect:/admin-list";
	}
	@GetMapping("/LoginAdmin")
	public String userLoginForm(Model model) {
		model.addAttribute("login", new Login());
		return "AdminLoginform";
	}
	@PostMapping("/LoginServletAdmin")
	public String userLogin(@ModelAttribute("login") Login login) {
		//u.setEmail();
		Admin admin=dao.getAdminById(login.getLoginId());
		//System.out.println(admin);
		if(admin.getPassword().equals(login.getPassword()) && admin.getEmail().equals(login.getEmail())) {
			System.out.println("Login Successfully");
			return "redirect:/adminloginpage";
		}
		return null;
	}
}
