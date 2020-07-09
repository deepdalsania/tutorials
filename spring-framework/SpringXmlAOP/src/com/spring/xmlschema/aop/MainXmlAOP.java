package com.spring.xmlschema.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlAOP {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("XMLBaedAOP.xml")) {
			StudentData student = (StudentData) context.getBean("student");
			student.getName();
			student.getUniName();
			student.getCgpa();
			student.dispThrowedException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
