package com.spring.javabased.bean.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeScopeConfig {

	@Bean
	@Scope(value = "prototype") // We can defined using one other technique
	// @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PrototypeScope prototypeScope() {
		return new PrototypeScope();
	}
}
