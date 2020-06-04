package com.spring.factory.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainNonStaticFactoryAnotherClass {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("NSFMAnotherClass.xml")) {
			NonStaticFactoryAnotherInterface anotherInterface = (NonStaticFactoryAnotherInterface) context
					.getBean("nsfmAnotherInterface");
			anotherInterface.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
