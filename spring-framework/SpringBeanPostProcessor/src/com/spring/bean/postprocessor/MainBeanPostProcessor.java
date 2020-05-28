package com.spring.bean.postprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanPostProcessor {

	public static void main(String[] args) {

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessor.xml")) {
			BeanPostProcessor postProcessor = (BeanPostProcessor) context.getBean("postprocessor");
			postProcessor.getMessage();
			context.registerShutdownHook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
