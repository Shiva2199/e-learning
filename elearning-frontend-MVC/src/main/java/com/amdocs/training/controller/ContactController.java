package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDaoImpl;
import com.amdocs.training.model.Contact;

@Controller
public class ContactController {
	ContactDAO dao = new ContactDaoImpl();

	@GetMapping("/contact-list")
	public String contactPage(Model model) {
		List<Contact> contactList = dao.findAll();
		model.addAttribute("list", contactList);
		return "admincontact";
	}
	@GetMapping("/user-contact-list")
	public String userContactPage(Model model) {
		List<Contact> contactList = dao.findAll();
		model.addAttribute("list", contactList);
		return "usercontact";
	}

	@GetMapping("/addContact")
	public String addContactForm(Model model) {
		model.addAttribute("contact", new Contact());
		return "add-Contact";
	}

	@PostMapping("/register-contact")
	public String addContact(@ModelAttribute("contact") Contact c) {
		dao.addContact(c);
		return "redirect:/contact-list";
	}

	@GetMapping("/delete-contact/{id}")
	public String deleteContact(@PathVariable("id") int id) {
		dao.deleteContact(id);
		return "redirect:/contact-list";
	}

	@GetMapping("/update-contact/{id}")
	public String updateContactForm(@PathVariable("id") int id, Model model) {
		Contact contact = dao.getContactById(id);
		model.addAttribute("contact", contact);
		return "update-contact";
	}

	@PostMapping("/update-contact")
	public String updateContact(@ModelAttribute("contact") Contact c) {

		dao.updateContact(c);
		return "redirect:/contact-list";
	}

}
