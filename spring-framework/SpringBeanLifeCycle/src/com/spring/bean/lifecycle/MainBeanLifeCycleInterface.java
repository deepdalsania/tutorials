package com.spring.bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanLifeCycleInterface {

	/*
	 * We can also use ClassPathXmlApplicationContext because it extends
	 * AbstractXmlApplicationContext
	 */
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanLifeCycleInterface.xml")) {
			BeanLifeCycleInterface lifeCycleInterface = (BeanLifeCycleInterface) context.getBean("beaninterface");
			lifeCycleInterface.getMessage();
			context.registerShutdownHook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
