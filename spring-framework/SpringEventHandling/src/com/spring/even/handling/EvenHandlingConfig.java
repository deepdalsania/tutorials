package com.spring.even.handling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EvenHandlingConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

	@Bean
	public ContextStartEventHandler startEvent() {
		return new ContextStartEventHandler();
	}

	@Bean
	public ContextStopEventHandler stopEvent() {
		return new ContextStopEventHandler();
	}

}
