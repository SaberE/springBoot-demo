package com.example.demo.service.user.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constant.SysConst;
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

	@Override
	public int register(String username, String password) {
		UserDomain userDomain = new UserDomain();
		userDomain.setUsername(username);
		userDomain.setPassword(password);
		userDomain.setInvalidFlag(0);
		userDomain.setAge(25);
		userDomain.setCreatedUser(SysConst.USER);
		userDomain.setUpdatedUser(SysConst.USER);
		userDomain.setCreatedDate(new Date());
		userDomain.setUpdatedDate(userDomain.getCreatedDate());
		int insertRowCount = userMapper.insertSelective(userDomain);
		return insertRowCount;
	}

}
