package com.example.demo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto implements Serializable{
	
	private String username;
	
	private String age;
	
	private String email;

	
}
