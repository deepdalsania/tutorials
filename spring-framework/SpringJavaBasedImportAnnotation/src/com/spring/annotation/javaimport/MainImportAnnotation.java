package com.spring.annotation.javaimport;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainImportAnnotation {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				StudentResultConfig.class)) {
			StudentData studentData = context.getBean(StudentData.class);
			studentData.setName("Foo");
			studentData.setUniversity("Stanford");
			StudentResult studentResult = context.getBean(StudentResult.class);
			studentResult.setCgpa(8.89f);
			System.out.println("Name : " + studentData.getName() + "\nUniversity : " + studentData.getUniversity()
					+ "\nCGPA : " + studentResult.getCgpa());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
