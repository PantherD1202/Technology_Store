package com.springboot.CRUD.beststore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.CRUD.beststore.models.User;
import com.springboot.CRUD.beststore.services.UserRepository;

@Controller
public class UsersController {
	@Autowired
	private UserRepository repo;

	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user", new User());
		return "users/signup";
	}

	@PostMapping("/process_register")
	public String processRegistration(User user) {
		repo.save(user);
		return "users/register_success";
	}
}
