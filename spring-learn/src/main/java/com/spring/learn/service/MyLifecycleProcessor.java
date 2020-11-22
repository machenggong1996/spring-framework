package com.spring.learn.service;

import org.springframework.context.LifecycleProcessor;

/**
 * @author machenggong
 * @date 2020/11/22
 */
public class MyLifecycleProcessor implements LifecycleProcessor {
	@Override
	public void onRefresh() {

	}

	@Override
	public void onClose() {

	}

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
