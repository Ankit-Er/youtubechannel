package com.progrank.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class MyBasicCustomAuthenticationFilter //implements Filter
extends OncePerRequestFilter {

	@Autowired
	AuthenticationManager manager;

	//@Override public void doFilter(ServletRequest req,HttpServletResponse res,FilterChain chain) throws IOException, ServletException {
	public void doFilterInternal(HttpServletRequest req,
			HttpServletResponse res,
			FilterChain chain)
			throws IOException, ServletException {

		// based upon request
		//HttpServletRequest request = (HttpServletRequest) req;
		String authObj = req.getHeader("auth_key");

		// create authentication object
		var objToken = new MyCustomAuthenticationToken(authObj, null);
		
		try {
			// delegate obj to AuthenticationManager --> AuthenticationProvider
			var authPrincipal = manager.authenticate(objToken);
			
			//for future use save principal into SecurityContext
			if (authPrincipal.isAuthenticated()) {
				SecurityContextHolder.getContext().setAuthentication(authPrincipal);
				chain.doFilter(req, res);
			}
		} catch (AuthenticationException e) {
			new BadCredentialsException("Invalid Principal");
		}

	}

}
