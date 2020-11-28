package com.progrank.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

import com.progrank.security.filter.MyCsrfFilter;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired 
	MyCsrfFilter filter;
	 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		//http.csrf().disable();
		
		http.csrf(csrf -> //csrf.ignoringAntMatchers("/abc/**")
				csrf.csrfTokenRepository(new MyCustomCsrfToken())
				);
		
		http.addFilterAfter(filter, CsrfFilter.class);
	}
	
	
}
