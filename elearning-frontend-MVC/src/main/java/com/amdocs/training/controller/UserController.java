package com.amdocs.training.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.authentication.Login;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDaoImpl;
import com.amdocs.training.model.User;

@Controller
public class UserController {

	
	UserDAO dao=new UserDaoImpl();
	
	@GetMapping("/logout")
	public String userLogoutpage() {
		return "Logout";
	}
	
	@GetMapping("/userpage")
	public String userpage() {
		return "Userpage";
	}
	
	@GetMapping("/user-list")
	public String userlistPage(Model model) {
		List<User> userList=dao.findAll();
		model.addAttribute("list",userList);
		return "users";
	}
	
	@GetMapping("/addUser")
	public String addUserForm(Model model) {
		model.addAttribute("user", new User());
		return "add-User";
	}
	@PostMapping("/register")
	public String addUser(@ModelAttribute("user") User u) {
		dao.addUser(u);
		return "redirect:/user-list";
	}
	@GetMapping("/delete-user/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		dao.deleteUser(id);
		return "redirect:/user-list";
	}
	@GetMapping("/update-user/{id}")
	public String updateUserForm(@PathVariable("id") int id,Model model) {
		User user=dao.getUserById(id);
		model.addAttribute("user",user);
		return "update-user";
	}
	@PostMapping("/update-user")
	public String updateUser(@ModelAttribute("user") User u) {
		
		dao.updateUser(u);
		return "redirect:/user-list";
	}
	@GetMapping("/LoginUser")
	public String userLoginForm(Model model) {
		model.addAttribute("login", new Login());
		return "UserLoginform";
	}
	@PostMapping("/LoginServlet")
	public String userLogin(@ModelAttribute("login") Login login) {
		//u.setEmail();
		try {
		User user=dao.getUserById(login.getLoginId());
		//System.out.println(user);
		if(user.getPassword().equals(login.getPassword()) && user.getEmail().equals(login.getEmail())) {
			System.out.println("Login Successfully");
			return "redirect:/userpage";
		}
		}
		catch(Exception e) {
			System.out.println("Invalid login credentials");;
		}
		return "redirect:/LoginUser";
	}
	@GetMapping("/LogoutUser")
	public String userLogoutPage(Model model) {
		model.addAttribute("login", new Login());
		return "Loginpage";
	}
	
}
