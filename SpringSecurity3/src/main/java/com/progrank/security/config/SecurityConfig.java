package com.progrank.security.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsManager userDetailsService() {
		return new JdbcUserDetailsManager(dataSource());
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	} 
	
	@Bean 
	public DataSource dataSource() {
		return
				new DriverManagerDataSource("jdbc:mysql://localhost/mydb",
						"root", 
						"admin");
		
	}
	 @Override
	protected void configure(HttpSecurity http) throws Exception {
		 http.csrf().disable();
		http.authorizeRequests().mvcMatchers("/createUser")
		.permitAll()
		.anyRequest().authenticated();
	}
	
}








