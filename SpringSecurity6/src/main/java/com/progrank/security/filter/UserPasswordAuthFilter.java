package com.progrank.security.filter;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.progrank.security.auth.OTPAuthToken;
import com.progrank.security.auth.UserPasswordAuthToken;
import com.progrank.security.model.UserSecretKey;
import com.progrank.security.repo.UserSecretKeyRepo;


@Component
public class UserPasswordAuthFilter extends OncePerRequestFilter {
	
	@Autowired AuthenticationManager manager;
	
	@Autowired UserSecretKeyRepo userSecretKeyRepo;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response,
			FilterChain filterChain)
			throws ServletException, IOException {
		
		var uname = request.getHeader("uname");
		var password = request.getHeader("password");
		
		var key = request.getHeader("secret-key");
		
		if(key == null) {
			//uid and password
			var a = new UserPasswordAuthToken(uname,password);
			var auth = manager.authenticate(a);
			
			
			
			//save generated key into db
			UserSecretKey secretKey = new UserSecretKey();
			secretKey.setKey((new Random().nextInt(999)*1000)+"");
			secretKey.setUsername(uname);
			
			userSecretKeyRepo.save(secretKey);
			
		}
		else {
			// through the key 
			var auth = manager.authenticate(new OTPAuthToken(uname,password));
			
			// generate a token
            response.setHeader("Authorization", UUID.randomUUID().toString());
		}

	}

	@Override
    protected boolean shouldNotFilter(HttpServletRequest req)
    		throws ServletException {
        return !req.getServletPath().equals("/hello");
    }
}