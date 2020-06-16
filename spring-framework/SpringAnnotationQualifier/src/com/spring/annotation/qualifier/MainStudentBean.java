package com.spring.annotation.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentBean {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("QualifierAnnotation.xml")) {
			StudentBranchData branchData = (StudentBranchData) context.getBean("stuBranch");
			branchData.displayData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
