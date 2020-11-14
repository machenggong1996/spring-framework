package com.spring.learn;

import com.spring.learn.config.MyConf;
import com.spring.learn.service.MyBeanFactoryPostProcessor;
import com.spring.learn.service.MyBeanFactoryRegisterPostProcessor;
import com.spring.learn.service.MyBeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author machenggong
 * @date 2020/11/12
 */
public class LearnMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class,
		                                                                                    MyBeanFactoryPostProcessor.class,
		                                                                                    MyBeanFactoryRegisterPostProcessor.class,
		                                                                                    MyBeanPostProcessor.class);
		String[] names = context.getBeanDefinitionNames();
		for (String beanName : names) {
			System.out.println(beanName);
		}
	}

}
