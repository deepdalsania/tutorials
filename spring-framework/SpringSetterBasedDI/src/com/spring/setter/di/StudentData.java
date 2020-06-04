package com.spring.setter.di;

public class StudentData {

	private UniversityData university;
	private StudentResultData result;
	private String name;

	public void setUniversity(UniversityData university) {
		this.university = university;
	}

	public void getUniversity() {
		university.getUniName();
	}

	public void setResult(StudentResultData result) {
		this.result = result;
	}

	public void getResult() {
		result.getResult();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getName() {
		System.out.println("Name : " + name);
	}

}
