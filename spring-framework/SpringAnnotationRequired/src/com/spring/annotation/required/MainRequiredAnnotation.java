package com.spring.annotation.required;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRequiredAnnotation {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("RequiredAnnotation.xml")) {
			StudentData student = (StudentData) context.getBean("student");
			System.out.println("Name : " + student.getName() + "\nUniversity : " + student.getUniversity() + "\nCGPA : "
					+ student.getCgpa());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
