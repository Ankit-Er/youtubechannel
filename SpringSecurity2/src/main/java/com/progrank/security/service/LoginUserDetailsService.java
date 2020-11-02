package com.progrank.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.progrank.security.entity.User;
import com.progrank.security.repo.LoginUser;
import com.progrank.security.repo.UserRepository;


public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<User> user = repo.findByUsername(username);
		System.out.println(user);
		User u = user.orElseThrow(() -> new UsernameNotFoundException("User Not Found !"));
		return new LoginUser(u);
	}

}
