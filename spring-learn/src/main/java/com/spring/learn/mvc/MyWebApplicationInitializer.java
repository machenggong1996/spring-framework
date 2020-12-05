package com.spring.learn.mvc;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author machenggong
 * @date 2020/12/05
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {


	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//初始化spring环境和spring-web环境
		System.out.println("初始化spring环境和spring-web环境");
	}
}
