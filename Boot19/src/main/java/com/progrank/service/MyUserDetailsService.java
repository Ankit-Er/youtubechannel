package com.progrank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.progrank.entity.User;
import com.progrank.repo.UserRepo;


@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<User> user = repo.findByUsername(username);
		System.out.println(user);
		User u = user.orElseThrow(() -> new UsernameNotFoundException("User Not Found !"));
		return new UserPrincipal(u);
	}

}
