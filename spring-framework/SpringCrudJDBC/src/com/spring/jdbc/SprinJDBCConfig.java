package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SprinJDBCConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://IP:Port/database_name");
		dataSource.setUsername("username");
		dataSource.setPassword("password");
		return dataSource;
	}

	@Bean
	public JdbcTemplate stuJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	@Bean
	public StudentDataJDBCTemplate setTemplate() {
		StudentDataJDBCTemplate jdbcTemplate = new StudentDataJDBCTemplate();
		jdbcTemplate.setJdbcTemplate(stuJdbcTemplate());
		return jdbcTemplate;
	}
}
