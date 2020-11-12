package com.spring.learn;

import com.spring.learn.config.MyConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author machenggong
 * @date 2020/11/12
 */
public class LearnMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names) {
			System.out.println(beanName);
		}
	}

}
