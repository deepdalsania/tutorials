package com.spring.custom.event.handling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCustomEvent {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CustomEventConfig.class)) {
			CustomEventPublisher eventPublisher = context.getBean(CustomEventPublisher.class);
			eventPublisher.publish();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
