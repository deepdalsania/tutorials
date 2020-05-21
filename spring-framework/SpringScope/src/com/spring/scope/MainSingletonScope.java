package com.spring.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSingletonScope {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SingletonScope.xml")) {
			SingletonScope scope = (SingletonScope) context.getBean("singletonscope");
			scope.setMessage("Welcome to the Spring Tutorials!!!!");
			scope.getMessage();
			SingletonScope sScope = (SingletonScope) context.getBean("singletonscope");
			sScope.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
