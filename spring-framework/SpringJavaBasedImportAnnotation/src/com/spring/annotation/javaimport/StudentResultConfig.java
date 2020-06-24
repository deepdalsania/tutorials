package com.spring.annotation.javaimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = StudentDataConfig.class)
public class StudentResultConfig {

	/*
	 * The @Import annotation allows for loading @Bean definitions from another
	 * configuration class. The @Import annotation is used to import one or
	 * more @Configuration classes. This annotation provides the functionality
	 * equivalent to <import/> element in xml based configuration.
	 */

	@Bean
	public StudentResult studentResult() {
		return new StudentResult();
	}
}
