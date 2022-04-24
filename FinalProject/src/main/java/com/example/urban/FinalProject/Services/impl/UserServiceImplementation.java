package com.example.urban.FinalProject.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urban.FinalProject.Services.UserService;
import com.example.urban.FinalProject.bean.Users;
import com.example.urban.FinalProject.repo.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository userRepository;
	
	public boolean signUp(String fullname, String email, String address, String password ) {
		try {
			Users user = new Users();
			user.setFullname(fullname);
			user.setEmail(email);
			user.setAddress(address);
			user.setPassword(password);
			userRepository.save(user);	
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}



}
