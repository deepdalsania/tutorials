package com.spring.bean.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitBeanPostProcessor implements BeanPostProcessor {

	/*
	 * Here you can implement any complex logic that you want to perform before and
	 * after bean initialization
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before Bean Initialization : " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After Bean Initialization : " + beanName);
		return bean;
	}

}
