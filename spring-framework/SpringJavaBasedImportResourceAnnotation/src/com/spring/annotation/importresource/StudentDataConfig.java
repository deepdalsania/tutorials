package com.spring.annotation.importresource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDataConfig {

	@Bean
	public StudentData studentData() {
		return new StudentData();
	}
}
