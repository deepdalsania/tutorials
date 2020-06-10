package com.spring.setter.collection.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterCollectionDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SetterCollectionBean.xml")) {
			SetterCollectionDI collection = (SetterCollectionDI) context.getBean("setterCollection");
			collection.displayData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
