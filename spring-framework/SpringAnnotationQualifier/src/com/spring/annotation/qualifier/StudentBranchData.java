package com.spring.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentBranchData {

	/*
	 * There may be a situation when you create more than one bean of the same type
	 * and want to wire only one of them with a property. In such cases, you can use
	 * the @Qualifier annotation along with @Autowired to remove the confusion by
	 * specifying which exact bean will be wired.
	 */
	@Autowired
	@Qualifier(value = "student2")
	private StudentData student;

	private String branch;

	public StudentBranchData(String branch) {
		this.branch = branch;
	}

	public void displayData() {
		System.out.println("Name : " + student.getName() + "\nBranch : " + branch + "\nUniversity : "
				+ student.getUniversity() + "\nCGPA : " + student.getCgpa());
	}
}
