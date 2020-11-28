package com.progrank.security.auth;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class SecretKeyAuthToken extends UsernamePasswordAuthenticationToken {

	public SecretKeyAuthToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}

	public SecretKeyAuthToken(Object principal, Object credentials) {
		super(principal, credentials);
	}


}
