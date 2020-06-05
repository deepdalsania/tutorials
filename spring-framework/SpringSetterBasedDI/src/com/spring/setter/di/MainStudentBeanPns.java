package com.spring.setter.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentBeanPns {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("StudentBeanUsingPns.xml")) {
			StudentData student = (StudentData) context.getBean("pstudent");
			student.getName();
			student.getUniversity();
			student.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
