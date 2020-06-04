package com.spring.factory.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStaticFactoryOwnClass {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SFMOwnClass.xml")) {
			StaticFactoryOwnClass sfmOwnClass = (StaticFactoryOwnClass) context.getBean("sfmOwnClass");
			sfmOwnClass.message();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
