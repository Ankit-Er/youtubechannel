package com.progrank.security.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		/*
		 * http.authorizeRequests().anyRequest().permitAll();
		 * 
		 * http.cors(c -> { CorsConfigurationSource cs = resource -> { CorsConfiguration
		 * cc = new CorsConfiguration(); cc.setAllowedOrigins(Arrays.asList("*"));
		 * cc.setAllowedMethods(Arrays.asList("GET","POST")); return cc; }; });
		 */
		
	}

}
