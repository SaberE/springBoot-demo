package com.example.demo.service.user;

import com.example.demo.model.UserDomain;

public interface UserService {
	
	UserDomain getUserInfoByCond(String username, String password);

}
