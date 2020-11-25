package com.spring.learn.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author machenggong
 * @date 2020/11/23
 */
public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigOfAOP.class);
		MathCalculator calculator = context.getBean(MathCalculator.class);
		System.out.println(calculator.div(10, 2));
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
