package com.progrank.security.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.DefaultCsrfToken;

public class MyCustomCsrfToken implements CsrfTokenRepository {

	@Override
	public CsrfToken generateToken(HttpServletRequest request) {
		CsrfToken csrf = new DefaultCsrfToken
				("X-CSRF-TOKEN", "_ankit", "ABCD123456");
		return csrf;
	}

	@Override
	public void saveToken(CsrfToken token, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public CsrfToken loadToken(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
