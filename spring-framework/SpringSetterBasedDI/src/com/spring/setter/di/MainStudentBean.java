package com.spring.setter.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentBean {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("StudentBean.xml")) {
			StudentData student = (StudentData) context.getBean("student");
			student.getName();
			student.getUniversity();
			student.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
