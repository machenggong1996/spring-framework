package com.spring.learn.config;

import com.spring.learn.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

	@Bean
	public UserService userService() {
		return new UserService();
	}

}