package com.spring.innerbean.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInnerBeanDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("InnerBeanDI.xml")) {
			ThreatNotifier notifier = (ThreatNotifier) context.getBean("threatNotifier");
			notifier.notifyThreat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
