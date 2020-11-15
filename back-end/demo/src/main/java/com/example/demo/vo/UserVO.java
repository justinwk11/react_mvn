package com.example.demo.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserVO {
	int id;
	String username;
	String password;
	String firstName;
	String lastName;
	int age;
	int salary;
}
