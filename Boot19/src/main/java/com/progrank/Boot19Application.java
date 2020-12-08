package com.progrank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication//(exclude = SecurityAutoConfiguration.class)
public class Boot19Application {

	public static void main(String[] args) {
		SpringApplication.run(Boot19Application.class, args);
	}

}
