package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;

@Component
public class UserService {
	
	@Autowired
	@Qualifier("oracle")
	UserDao userDao;
	
	public String getName(int number) {
		
		return userDao.getName(number);
	}

}
