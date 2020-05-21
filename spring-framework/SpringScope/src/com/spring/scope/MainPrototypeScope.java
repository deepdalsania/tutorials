package com.spring.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrototypeScope {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("PrototypeScope.xml")) {
			PrototypeScope scope = (PrototypeScope) context.getBean("prototypescope");
			scope.setMessage("Welcome to the Spring Tutorials!!!!");
			scope.getMessage();
			PrototypeScope pScope = (PrototypeScope) context.getBean("prototypescope");
			pScope.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
