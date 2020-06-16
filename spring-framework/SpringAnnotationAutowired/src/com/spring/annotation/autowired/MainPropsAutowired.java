package com.spring.annotation.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPropsAutowired {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"PropsAutowiredAnnotation.xml")) {
			ThreatNotifierAutowiredProps props = (ThreatNotifierAutowiredProps) context.getBean("propsThreatNotifier");
			props.notifyThreat();
			props.getIocType();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
