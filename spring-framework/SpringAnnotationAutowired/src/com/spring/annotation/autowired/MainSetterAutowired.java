package com.spring.annotation.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterAutowired {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SetterAutowiredAnnotation.xml")) {
			ThreatNotifierSetterAutowired setters = (ThreatNotifierSetterAutowired) context
					.getBean("setterThreatNotifier");
			setters.notifyThreat();
			setters.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
