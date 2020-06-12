package com.spring.autowire.byname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowireByName {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AutowireByName.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
			notifier.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
