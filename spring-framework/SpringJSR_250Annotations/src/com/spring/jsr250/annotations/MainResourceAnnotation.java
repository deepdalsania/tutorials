package com.spring.jsr250.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainResourceAnnotation {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ResourceAnnotation.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
			notifier.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
