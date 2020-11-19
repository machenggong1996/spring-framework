package com.spring.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author machenggong
 * @date 2020/11/19
 */
@Service
public class A {

	@Autowired
	private B b;

//	public A(B a) {
//
//	}

}
