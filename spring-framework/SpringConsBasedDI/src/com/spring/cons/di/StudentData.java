package com.spring.cons.di;

public class StudentData {

	private float cgpa;
	private String name, university;
	private UniversityData uniData;
	private StudentResultData result;

	public StudentData(float cgpa, String name) {
		this.cgpa = cgpa;
		this.name = name;
	}

	public StudentData(float cgpa, String name, String university) {
		this.cgpa = cgpa;
		this.name = name;
		this.university = university;
	}

	public StudentData(String name, UniversityData data, StudentResultData resultData) {
		this.name = name;
		this.uniData = data;
		this.result = resultData;
	}

	public void getStudentData() {
		System.out.println("<---- constructor argument using the type attribute ---->");
		System.out.println("Name : " + name + "\nCGPA : " + cgpa);
	}

	public void getStuData() {
		System.out.println("<---- constructor argument using the index attribute ---->");
		System.out.println("Name : " + name + "\nUniversity : " + university + "\nCGPA : " + cgpa);
	}

	public void getStData() {
		System.out.println("<---- constructor argument using nested ref, neater ref, and value attributes ---->");
		System.out.println("Name : " + name);
		uniData.getUniName();
		result.getResult();
	}

	public void getcStudentData() {
		System.out.println("<---- constructor argument using c-namespace ---->");
		System.out.println("Name : " + name);
		uniData.getUniName();
		result.getResult();
	}
}
