package com.progrank.security.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class MyCsrfFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, 
			FilterChain filterChain)
			throws ServletException, IOException {
		
		CsrfToken ob =  (CsrfToken)request.getAttribute("_ankit");
		
		System.out.println(ob.getParameterName());
		System.out.println(ob.getToken());
		filterChain.doFilter(request, response);
	}
	
	
}
