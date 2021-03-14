package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.model.UserDomain;



@Mapper
@Component
public interface UserMapper {

	UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);
	
}
