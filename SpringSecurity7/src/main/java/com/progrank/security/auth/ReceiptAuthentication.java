package com.progrank.security.auth;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class ReceiptAuthentication 
extends UsernamePasswordAuthenticationToken {

	public ReceiptAuthentication(Object principal, Object credentials) {
		super(principal, credentials);
	}

	public ReceiptAuthentication(Object principal, Object credentials,
			Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}
}