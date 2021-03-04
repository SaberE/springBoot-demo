package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User;
import com.example.demo.service.BseDaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class HelloController {

	@Autowired
	BseDaoService bseDaoService;
	
	@RequestMapping({"/hello", "/helloWorld"})
	String hello() {
		return "hello!";
	}  
	
	@RequestMapping({"/queryInvoices"})
	User queryInvoices() throws JsonMappingException, JsonProcessingException {
		User user = bseDaoService.selectOne(new User());
		return user;
	}  
}
