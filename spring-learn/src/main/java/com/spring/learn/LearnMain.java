package com.spring.learn;

import com.spring.learn.service.A;
import com.spring.learn.service.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author machenggong
 * @date 2020/11/12
 */
public class LearnMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(A.class, B.class);
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names) {
			System.out.println(beanName);
		}
	}

}
