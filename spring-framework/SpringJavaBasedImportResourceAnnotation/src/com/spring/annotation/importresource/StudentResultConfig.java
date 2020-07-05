package com.spring.annotation.importresource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(value = StudentDataConfig.class)
@ImportResource(value = { "StudentBranch.xml" })
public class StudentResultConfig {

	/*
	 * The @ImportResource annotation is used to import one or more XML
	 * configuration files. Here file is stored in src which is class path so we
	 * don't need to specify full path it will auto detect file using classpath but
	 * if you put you file any where else the you must have to set that path as
	 * classpath or specify full path here
	 */

	@Bean
	public StudentResult studentResult() {
		return new StudentResult();
	}
}
