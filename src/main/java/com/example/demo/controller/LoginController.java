package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.UserDomain;
import com.example.demo.service.user.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping(value="/test/login")
	UserDomain  userLogin() {
		UserDomain userInfoByCond = userService.getUserInfoByCond("admin", "admin");
		return userInfoByCond;
	}

}
