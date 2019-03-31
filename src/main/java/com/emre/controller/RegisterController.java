package com.emre.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.emre.entities.User;
import com.emre.services.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService UserService;

	@GetMapping("/register")
	public String registerForm(Model model) {
		model.addAttribute("user", new User()); 
		
		return "views/registerForm";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid User user, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "views/registerForm";
		}
		if(UserService.isUserPresent(user.getEmail())) {
			model.addAttribute("exist", true);
			return "views/registerForm";
		}
		UserService.createUser(user);
		return "views/success";
	}
}
