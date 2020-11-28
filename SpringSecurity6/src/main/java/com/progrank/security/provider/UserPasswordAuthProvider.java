package com.progrank.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.progrank.security.auth.UserPasswordAuthToken;
import com.progrank.security.service.MyUserDetailsService;

@Component
public class UserPasswordAuthProvider implements AuthenticationProvider {

	@Autowired
	MyUserDetailsService userDetailsService;

	@Autowired
	PasswordEncoder encoder;

	@Override
	public Authentication authenticate(Authentication auth) {

		var user = userDetailsService.loadUserByUsername(auth.getName());

		if (encoder.matches(auth.getCredentials() + "", user.getPassword())) {
			return new UserPasswordAuthToken(user.getUsername(),
					user.getPassword(),
					user.getAuthorities());
		}

		throw new BadCredentialsException("Failed User Authentication ??");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UserPasswordAuthToken.class.equals(authentication);
	}
}
