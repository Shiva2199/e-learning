package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.impl.FeedbackDaoImpl;
import com.amdocs.training.model.Feedback;
@Controller
public class FeedbackController {

	FeedbackDAO dao=new FeedbackDaoImpl();
	@GetMapping("/feedback-list")
	public String feedbackPage(Model model) {
		List<Feedback> feedbackList=dao.findAll();
		model.addAttribute("list",feedbackList);
		return "feedback";
	}
	@GetMapping("/admin-feedback-list")
	public String adminfeedbackPage(Model model) {
		List<Feedback> feedbackList=dao.findAll();
		model.addAttribute("list",feedbackList);
		return "adminfeedback";
	}
	
	@GetMapping("/addFeedback")
	public String addFeedbackForm(Model model) {
		model.addAttribute("feedback", new Feedback());
		return "add-Feedback";
	}
	@PostMapping("/register-feedback")
	public String addFeedback(@ModelAttribute("feedback") Feedback f) {
		dao.addfeedback(f);
		return "redirect:/feedback-list";
	}
	@GetMapping("/delete-feedback/{id}")
	public String deleteFeedback(@PathVariable("id") int id) {
		dao.deletefeedback(id);
		return "redirect:/feedback-list";
	}
	
	@GetMapping("/updateFeedback/{id}")
	public String updateFeedbackForm(@PathVariable("id") int id,Model model) {
		Feedback feedback=dao.getFeedbackById(id);
		model.addAttribute("feedback", feedback);
		return "update-feedback";
	}
	@PostMapping("/updateFeedback")
	public String updateFeedback(@ModelAttribute("feedback") Feedback f) {
		dao.updatefeedback(f);
		return "redirect:/feedback-list";
	}
}
