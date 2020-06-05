package com.spring.cons.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentBeanCns {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("StudentBeanUsingCns.xml")) {
			StudentData student = (StudentData) context.getBean("cstudent");
			student.getcStudentData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
