package com.progrank.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import com.progrank.security.entity.User;

@Service
public class MyUserService {

	@Autowired
	UserDetailsManager manager;
	
	@Autowired
	PasswordEncoder encoder;
	
	public void addUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		manager.createUser(user);
	}
	
}
