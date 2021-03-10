package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.TestDaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class HelloController {

	@Autowired
	TestDaoService bseDaoService;
	
	@RequestMapping({"/hello", "/helloWorld"})
	String hello() {
		return "hello!";
	}  
	
	@RequestMapping({"/admin"})
	UserDto queryInvoices() throws JsonMappingException, JsonProcessingException {
		UserDto user = bseDaoService.selectOne(new UserDto());
		return user;
	}  
}
