package com.spring.bean.definheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanDefInheritance {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
			ParentBean parent = (ParentBean) context.getBean("parentBean");
			parent.getName();
			parent.getTechnology();

			ChildBean child = (ChildBean) context.getBean("childBean");
			child.getName();
			child.getTechnology();
			child.getAge();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
