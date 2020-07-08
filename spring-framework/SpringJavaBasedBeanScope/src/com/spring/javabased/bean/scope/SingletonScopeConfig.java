package com.spring.javabased.bean.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonScopeConfig {

	@Bean
	@Scope(value = "singleton") // if we are not defining the singleton is by default. We can defined using one
								// other technique
	// @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public SingletonScope singletonScope() {
		return new SingletonScope();
	}
}
