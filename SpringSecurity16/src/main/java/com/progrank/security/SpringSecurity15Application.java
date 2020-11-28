package com.progrank.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* OAuth2 is protocol for token based authorization.
 * OAuth2 is an authorization framework.
 * OAuth Roles: Resource Owner(User), Client(App), Resource Server, Authorization Server
 * OAuth work as an actor b/w client,user,authorization server and resource server
 * 
 * 
 * 
 * 
 * 
 * 
 * Grant Types =>
 * 				authorization_code
 * 				implicit		--> deprecated
 * 				client_credentials
 * 				refresh_token
 * 				password		--> deprecated
 * 
 * Video No:17,18, 19
 */

@SpringBootApplication
public class SpringSecurity15Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity15Application.class, args);
	}
}
