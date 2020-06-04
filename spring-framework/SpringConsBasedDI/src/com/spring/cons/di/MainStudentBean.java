package com.spring.cons.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentBean {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("StudentBean.xml")) {
			StudentData student = (StudentData) context.getBean("student");
			student.getStudentData();
			StudentData stu = (StudentData) context.getBean("stu");
			stu.getStuData();
			StudentData st = (StudentData) context.getBean("st");
			st.getStData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
