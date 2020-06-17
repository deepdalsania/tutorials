package com.spring.jsr250.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringCallbackAnnotation {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("CallbackAnnotations.xml")) {
			SpringCallbackAnnotations callback = (SpringCallbackAnnotations) context.getBean("callbackAnnotations");
			callback.getMessage();
			context.registerShutdownHook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
