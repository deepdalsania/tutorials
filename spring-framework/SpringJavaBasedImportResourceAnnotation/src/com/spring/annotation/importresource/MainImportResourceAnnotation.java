package com.spring.annotation.importresource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainImportResourceAnnotation {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				StudentResultConfig.class)) {
			StudentData studentData = context.getBean(StudentData.class);
			studentData.setName("Foo");
			studentData.setUniversity("Stanford");
			StudentBranch studentBranch = context.getBean(StudentBranch.class);
			studentBranch.setBranch("Information Technology");
			StudentResult studentResult = context.getBean(StudentResult.class);
			studentResult.setCgpa(8.89f);
			System.out.println("Name : " + studentData.getName() + "\nUniversity : " + studentData.getUniversity()
					+ "\nBranch : " + studentBranch.getBranch() + "\nCGPA : " + studentResult.getCgpa());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
