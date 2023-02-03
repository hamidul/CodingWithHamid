package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

@Controller
public class DemoMVCController {

	@RequestMapping("/home")
	String getIndexPage(Model model) {
		model.addAttribute("student",new Student());
		return "home";
	}
	
	@PostMapping("/processStudent")
	String processStudent(@ModelAttribute Student student, Model model) {
		System.out.println("First Name:::::::"+student.getFirstName());
		model.addAttribute("student", student);
		return "result";
	}
}
