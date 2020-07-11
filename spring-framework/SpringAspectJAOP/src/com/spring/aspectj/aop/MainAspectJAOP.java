package com.spring.aspectj.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAspectJAOP {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AspectJAOP.xml")) {
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
