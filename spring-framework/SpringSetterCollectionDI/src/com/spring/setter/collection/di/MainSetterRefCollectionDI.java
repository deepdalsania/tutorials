package com.spring.setter.collection.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetterRefCollectionDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"SetterRefCollectionBean.xml")) {
			SetterRefCollectionDI refCollection = (SetterRefCollectionDI) context.getBean("setterRefCollection");
			refCollection.displayData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
