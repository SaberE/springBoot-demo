package com.example.demo.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserDomain;
import com.example.demo.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDomain getUserInfoByCond(String username, String password) {
		UserDomain userDomain = userMapper.getUserInfoByCond(username, password);
		return userDomain;
	}

}
