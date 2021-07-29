package com.amdocs.training.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String indexpage(Model model) {
		model.addAttribute("message","Welcome to elearning portal");
		List<String> names=Arrays.asList("Shiva","Kiran","karthik");
		model.addAttribute("list",names);
		return "index";
	}
}
