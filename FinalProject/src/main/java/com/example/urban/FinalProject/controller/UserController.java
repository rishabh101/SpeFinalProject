package com.example.urban.FinalProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urban.FinalProject.Services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/signup")
	public boolean signUp(String fullname, String email, String address, String password ) {
		return userService.signUp(fullname, email, address, password);
	}
}
