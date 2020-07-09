package com.spring.xmlschema.aop;

public class StudentData {

	private float cgpa;

	private String name, uniName;

	public float getCgpa() {
		System.out.println("CGPA : " + cgpa);
		return cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniName() {
		System.out.println("University : " + uniName);
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public void dispThrowedException() {
		System.out.println("Exception Raised!!!!");
		throw new IllegalArgumentException();
	}
}
