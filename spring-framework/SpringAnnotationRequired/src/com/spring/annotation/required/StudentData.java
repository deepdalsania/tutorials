package com.spring.annotation.required;

import org.springframework.beans.factory.annotation.Required;

public class StudentData {
	private float cgpa;
	private String name, university;

	public float getCgpa() {
		return cgpa;
	}

	/*
	 * This annotation simply indicates that the affected bean property must be
	 * populated at configuration time, through an explicit property value in a bean
	 * definition or through autowiring.
	 */
	@Required
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return university;
	}

	@Required
	public void setUniversity(String university) {
		this.university = university;
	}

}
