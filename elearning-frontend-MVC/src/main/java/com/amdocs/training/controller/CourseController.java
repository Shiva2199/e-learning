package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.impl.CourseDaoImpl;
import com.amdocs.training.model.Course;


@Controller
public class CourseController {
	
	CourseDAO dao=new CourseDaoImpl();
	@GetMapping("/courselist")
	public String userCoursePage(Model model) {
		List<Course> courseList=dao.findAll();
		model.addAttribute("list",courseList);
		return "Usercourse";
	}
	@GetMapping("/course-list")
	public String coursePage(Model model) {
		List<Course> courseList=dao.findAll();
		model.addAttribute("list",courseList);
		return "course";
	}
	
	@GetMapping("/addCourse")
	public String addCourseForm(Model model) {
		model.addAttribute("course", new Course());
		return "add-Course";
	}
	@PostMapping("/register-course")
	public String addCourse(@ModelAttribute("course") Course c) {
		dao.addCourse(c);
		return "redirect:/course-list";
	}
	@GetMapping("/delete-course/{id}")
	public String deleteCourse(@PathVariable("id") int id) {
		dao.deleteCourse(id);
		return "redirect:/course-list";
	}
	@GetMapping("/update-course/{id}")
	public String updateCourseForm(@PathVariable("id") int id,Model model) {
		Course course=dao.getCourseById(id);
		model.addAttribute("course",course);
		return "update-course";
	}
	@PostMapping("/update-course")
	public String updateCourse(@ModelAttribute("course") Course c) {
		
		dao.updateCourse(c);
		return "redirect:/course-list";
	}
	
}
