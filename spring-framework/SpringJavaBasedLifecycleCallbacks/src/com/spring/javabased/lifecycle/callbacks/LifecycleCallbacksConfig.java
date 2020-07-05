package com.spring.javabased.lifecycle.callbacks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleCallbacksConfig {

	@Bean(initMethod = "init", destroyMethod = "cleanup")
	public LifecycleCallbacks lifecycleCallbacks() {
		return new LifecycleCallbacks();
	}
}
