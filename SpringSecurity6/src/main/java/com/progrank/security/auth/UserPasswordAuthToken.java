package com.progrank.security.auth;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class UserPasswordAuthToken 
extends UsernamePasswordAuthenticationToken {

	public UserPasswordAuthToken(Object principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}

	public UserPasswordAuthToken(Object principal, Object credentials) {
		super(principal, credentials);
	}

}
