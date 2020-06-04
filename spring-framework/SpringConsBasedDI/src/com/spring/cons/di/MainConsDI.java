package com.spring.cons.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConsBasedDI.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
