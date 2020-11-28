package com.progrank.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.progrank.security.filter.MyBasicCustomAuthenticationFilter;
import com.progrank.security.provider.MyAuthenticationProvider;

@Configuration
public class ApplicationConfig extends WebSecurityConfigurerAdapter {

	@Autowired MyAuthenticationProvider provider;
	@Autowired MyBasicCustomAuthenticationFilter filter;
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(provider);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterAt(filter, BasicAuthenticationFilter.class);
		http.authorizeRequests().anyRequest().permitAll();
	}

	
}
