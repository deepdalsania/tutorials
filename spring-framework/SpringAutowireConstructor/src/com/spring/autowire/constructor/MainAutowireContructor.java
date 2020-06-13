package com.spring.autowire.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireContructor {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AutowireConstructor.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
			notifier.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
