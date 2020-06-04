package com.spring.factory.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStaticFactoryAnotherClass {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SFMAnotherClass.xml")) {
			StaticFactoryAnotherInterface anotherInterface = (StaticFactoryAnotherInterface) context
					.getBean("sfmAnotherClass");
			anotherInterface.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
