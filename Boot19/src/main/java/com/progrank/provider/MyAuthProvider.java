package com.progrank.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class MyAuthProvider implements AuthenticationProvider {

	@Autowired
	private UserDetailsService userDetailsService;	//create a bean MyUserDetailsService class
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		//return null
		//throw exeception
		//authenticate user request
		
		String username = authentication.getName();
		String password = authentication.getCredentials().toString();
		
		UserDetails user = userDetailsService.loadUserByUsername(username);
		
		if(user!=null && passwordEncoder.matches(password,user.getPassword())) {
			return new UsernamePasswordAuthenticationToken(username
					,password);
		}
		
		return null;
		
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.equals(authentication);
	}

}
