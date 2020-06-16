package com.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class ThreatNotifierConstructorAutowired {

	private IocCollectorConstructorAutowired collector;
	private String iocType;

	/*
	 * A constructor @Autowired annotation indicates that the constructor should be
	 * autowired when creating the bean, even if no <constructor-arg> elements are
	 * used while configuring the bean in XML file
	 */
	@Autowired
	public ThreatNotifierConstructorAutowired(IocCollectorConstructorAutowired collector, String iocType) {
		super();
		System.out.println("<---- Inside ThreatNotifierConstructorAutowired constructor ---->");
		this.collector = collector;
		this.iocType = iocType;
	}

	public void getIocType() {
		System.out.println("IocType : " + iocType);
	}

	public void notifyThreat() {
		collector.collectIoc();
	}
}
