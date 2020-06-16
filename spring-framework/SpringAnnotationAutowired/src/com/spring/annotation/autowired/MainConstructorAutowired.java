package com.spring.annotation.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructorAutowired {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"ConstructorAutowiredAnnotation.xml")) {
			ThreatNotifierConstructorAutowired cons = (ThreatNotifierConstructorAutowired) context
					.getBean("consThreatNotifier");
			cons.notifyThreat();
			cons.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
