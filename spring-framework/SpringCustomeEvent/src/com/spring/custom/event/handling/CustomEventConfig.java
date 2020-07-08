package com.spring.custom.event.handling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomEventConfig {

	@Bean
	public CustomEventHandler eventHandler() {
		return new CustomEventHandler();
	}

	@Bean
	public CustomEventPublisher eventPublisher() {
		return new CustomEventPublisher();
	}
}
