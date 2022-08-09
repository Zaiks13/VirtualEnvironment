package com.masomenos.virtualenvironment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.masomenos.virtualenvironment.entity.User;
import com.masomenos.virtualenvironment.repository.RoleRepository;
import com.masomenos.virtualenvironment.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired 
	private UserService userService;
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	public String userForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}

}
