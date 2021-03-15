package com.example.demo.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.service.user.UserService;

@Service
public class LoginServiceImpl {
	
	@Autowired
	private UserService userService;
	
	

}
