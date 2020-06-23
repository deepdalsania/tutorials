package com.spring.javabased.configuration.inject.bean.dependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainInjectBeanDependency {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ThreatNotifierConfig.class)) {
			ThreatNotifier notifier = context.getBean(ThreatNotifier.class);
			notifier.notifyThreat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
