package com.spring.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringBeanLifeCycle {

	/*
	 * Kindly refer this :
	 * https://stackoverflow.com/questions/42018044/what-is-the-difference-between-
	 * registershutdownhook-and-close
	 */
	/*
	 * Why we can not use ApplicationContext because it is not implement
	 * ConfigurableApplicationContext while AbstractApplicationContext is an
	 * abstract class and it extends DefaultResourceLoader and implements
	 * ConfigurableApplicationContext
	 */
	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml")) {
			SpringBeanLifeCycle lifeCycle = (SpringBeanLifeCycle) context.getBean("beanlifecycle");
			lifeCycle.getMessage();
			context.registerShutdownHook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
