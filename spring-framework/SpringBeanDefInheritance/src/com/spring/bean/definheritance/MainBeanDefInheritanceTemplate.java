package com.spring.bean.definheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanDefInheritanceTemplate {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeansTemplate.xml")) {

			/*
			 * Trying to use such an abstract parent bean on its own (by referring to it as a
			 * ref property of another bean, or doing an explicit getBean() call with the
			 * parent bean id), will result in an error.
			 */
			ChildBean child = (ChildBean) context.getBean("childBean");
			child.getName();
			child.getTechnology();
			child.getAge();

			NestedChildBean nestedChild = (NestedChildBean) context.getBean("nestedChildBean");
			nestedChild.getName();
			nestedChild.getTechnology();
			nestedChild.getAge();
			nestedChild.getCity();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
