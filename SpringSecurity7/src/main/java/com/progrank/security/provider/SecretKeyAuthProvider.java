package com.progrank.security.provider;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.progrank.security.auth.SecretKeyAuthToken;
import com.progrank.security.repo.UserSecretKeyRepo;

@Component
public class SecretKeyAuthProvider implements AuthenticationProvider {

	@Autowired UserSecretKeyRepo secretKeyRepo;
	
	@Override
	public Authentication authenticate(Authentication auth) {
		var user = secretKeyRepo.findByUsername(auth.getName());

		if (user.isPresent()) {
			return new SecretKeyAuthToken(auth.getName(),
					auth.getCredentials() ,
					Arrays.asList(() -> "read"));
		}

		throw new BadCredentialsException("Failed Scret-key Authentication ??");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return SecretKeyAuthToken.class.equals(authentication);
	}
}
