package com.spring.learn.mvc;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HttpServletBean;

import java.io.File;

/**
 * @author machenggong
 * @date 2020/12/05
 */
public class MySpringApplication {

	public static void run() throws LifecycleException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(AppConfig.class);
		webApplicationContext.refresh();

		File base = new File(System.getProperty("java.io.tmpdir"));
		Tomcat tomcat =  new Tomcat();
		tomcat.setPort(8090);
		//不用addWeb
		//tomcat.addWebapp("/","") web项目 会调用WebApplicationInitializer的实现
		//不是web项目
		Context rootContext = tomcat.addContext("/",base.getAbsolutePath());
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		//tomcat启动过程中会调用 DispatcherServlet#init HttpServletBean中有init实现
		/**
		 * {@link HttpServletBean#init()}
		 */
		Tomcat.addServlet(rootContext,"learn",dispatcherServlet).setLoadOnStartup(1);
		rootContext.addServletMappingDecoded("/","learn");
		tomcat.start();
		tomcat.getServer().await();
	}

	public static void main(String[] args) {
		try {
			run();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
	}

}
