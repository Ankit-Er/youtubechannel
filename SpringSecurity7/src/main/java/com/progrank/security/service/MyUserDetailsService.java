package com.progrank.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.progrank.security.model.SecureUser;
import com.progrank.security.model.User;
import com.progrank.security.repo.UserDetailsRepo;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired UserDetailsRepo userDetailsRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		User u = userDetailsRepo.findByUsername(username)
								.orElse(new User());
		return new SecureUser(u);
	}

}
