package com.spring.bean.definheritance;

public class ParentBean {

	private String name, technology;

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

}
