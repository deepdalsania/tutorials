package com.spring.javabased.configuration.inject.bean.dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThreatNotifierConfig {

	@Bean
	public ThreatNotifier threatNotifier() {
		return new ThreatNotifier(iocCollector());
	}

	@Bean
	public IocCollector iocCollector() {
		return new IocCollector();
	}
}
