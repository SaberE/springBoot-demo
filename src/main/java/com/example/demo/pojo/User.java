package com.example.demo.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable{
	
	private String name;
	
	private String age;
	
	private String email;

	
}
