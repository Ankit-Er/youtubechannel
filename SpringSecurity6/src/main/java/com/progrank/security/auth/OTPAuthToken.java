package com.progrank.security.auth;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class OTPAuthToken extends UsernamePasswordAuthenticationToken {

	public OTPAuthToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}

	public OTPAuthToken(Object principal, Object credentials) {
		super(principal, credentials);
	}


}
