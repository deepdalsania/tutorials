package com.spring.jdbc.store.procedure;

public class StudentData {

	private Integer enNo;
	private String name, university;
	private Double cgpa;

	public Integer getEnNo() {
		return enNo;
	}

	public void setEnNo(Integer enNo) {
		this.enNo = enNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

}
