package com.example.demo.service;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class TestDaoService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	DataSource dataSource;
	
	public <T> T selectOne(T t) throws JsonMappingException, JsonProcessingException{
		Map<String, Object> queryForMap = jdbcTemplate.queryForMap("select t.* from t_user_user t limit 0 , 1");
		return (T) JSON.parseObject(JSON.toJSONString(queryForMap), t.getClass());
		
	}
	
}
