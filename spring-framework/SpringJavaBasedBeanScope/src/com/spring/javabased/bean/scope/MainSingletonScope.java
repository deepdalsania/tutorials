package com.spring.javabased.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSingletonScope {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SingletonScopeConfig.class)) {
			SingletonScope scope = (SingletonScope) context.getBean(SingletonScope.class);
			scope.setMessage("Welcome to the Spring Tutorials!!!!");
			System.out.println("Message : " + scope.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
