package com.example.urban.FinalProject.Services;

import org.springframework.stereotype.Service;


@Service
public interface UserService {
	boolean signUp(String fullname, String email, String address, String password );
}
