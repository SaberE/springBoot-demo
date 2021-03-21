package com.example.demo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.UserDomain;


@Mapper //声明这是一个mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<UserDomain>{

	UserDomain getUserInfoByCond(@Param("username") String username, @Param("password") String password);
	
}
