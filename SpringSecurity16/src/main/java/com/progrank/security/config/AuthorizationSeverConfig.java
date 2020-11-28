package com.progrank.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationSeverConfig 
extends AuthorizationServerConfigurerAdapter {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
		//http://localhost:8080/oauth/token?grant_type=password&username=Mark&password=1234&scope=read
		.withClient("progrank")
		.secret("pr123")
		.scopes("read").authorizedGrantTypes("password","refresh_token")
		.and()
		
		.withClient("progrank3")
		.secret("pr111")
		.scopes("info").authorizedGrantTypes("client_credentials")
		.and()
		//http://localhost:8080/oauth/authorize?response_type=code&client_id=progrank2&scope=read
		//http://localhost:8080/oauth/token?grant_type=authorization_code&code=rFgHEN&scope=read
		.withClient("progrank2")
		.secret("pr789")
		.scopes("read")
		.authorizedGrantTypes("authorization_code")
		.redirectUris("http://localhost:8083");
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager);
	}

}
