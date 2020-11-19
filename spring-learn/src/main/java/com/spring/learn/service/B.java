package com.spring.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author machenggong (chenggong@shanshu.ai)
 * @date 2020/11/19
 */
@Service
public class B {

	@Autowired
	private A a;

//	public B(A a) {
//
//	}

}
