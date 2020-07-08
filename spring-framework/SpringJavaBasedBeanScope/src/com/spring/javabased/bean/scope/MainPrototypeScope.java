package com.spring.javabased.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainPrototypeScope {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				PrototypeScope.class)) {
			PrototypeScope scope = (PrototypeScope) context.getBean(PrototypeScope.class);
			scope.setMessage("Welcome to the Spring Tutorials!!!!");
			System.out.println("Message : " + scope.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
