package com.spring.bean.definheritance;

public class ChildBean {

	private String name, technology;

	private int age;

	public void getName() {
		System.out.println("Name : " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getTechnology() {
		System.out.println("Technololgy : " + technology);
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void getAge() {
		System.out.println("Age : " + age);
	}

	public void setAge(int age) {
		this.age = age;
	}

}
