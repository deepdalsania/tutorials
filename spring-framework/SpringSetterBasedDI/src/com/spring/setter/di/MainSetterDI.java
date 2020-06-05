package com.spring.setter.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SetterBasedDI.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
