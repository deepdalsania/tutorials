package com.spring.cons.collection.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsCollectionDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConsCollectionBean.xml")) {
			ConsCollectionDI collection = (ConsCollectionDI) context.getBean("consCollection");
			collection.displayData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
