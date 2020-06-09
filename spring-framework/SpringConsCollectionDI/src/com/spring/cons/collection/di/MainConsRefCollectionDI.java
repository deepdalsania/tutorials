package com.spring.cons.collection.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsRefCollectionDI {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ConsRefCollectionBean.xml")) {
			ConsRefCollectionDI refFollection = (ConsRefCollectionDI) context.getBean("consRefCollection");
			refFollection.displayData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
