package com.progrank.security.provider;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.progrank.security.filter.MyCustomAuthenticationToken;

@Component
public class MyAuthenticationProvider implements AuthenticationProvider {

	@Value("${secret_key}")
	String secretKey;
	
	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		if(secretKey.equals(authentication.getName()))
		{
			return new MyCustomAuthenticationToken(null,null,null);
		}
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return MyCustomAuthenticationToken.class.equals(authentication);
	}

}
