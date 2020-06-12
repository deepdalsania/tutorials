package com.spring.autowire.bytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireByType {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AutowireByType.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
			notifier.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
