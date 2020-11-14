package com.spring.learn.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author machenggong
 * @date 2020/11/14
 * 实现BeanDefinitionRegistryPostProcessor会优先于实现实现BeanDefinitionPostProcessor 执行
 */
@Component
public class MyBeanFactoryRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("调用MyBeanFactoryRegisterPostProcessor#postProcessBeanDefinitionRegistry");
		//通过实现BeanDefinitionRegistryPostProcessor调用postProcessBeanDefinitionRegistry方法可以注册新的bean
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.setBeanClass(NewBean.class);
		registry.registerBeanDefinition("isNewBean", rootBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用MyBeanFactoryRegisterPostProcessor#postProcessBeanFactory");
		BeanDefinition bd = beanFactory.getBeanDefinition("myBeanFactoryRegisterPostProcessor");
		System.out.println(bd);
	}
}
