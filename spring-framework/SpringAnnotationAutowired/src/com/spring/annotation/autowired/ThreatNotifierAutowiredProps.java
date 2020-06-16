package com.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class ThreatNotifierAutowiredProps {

	/*
	 * You can use @Autowired annotation on properties to get rid of the setter
	 * methods. When you will pass values of autowired properties using <property>
	 * Spring will automatically assign those properties with the passed values or
	 * references.
	 */
	@Autowired
	private IocCollectorAutowiredProps iocCollector;

	private String iocType;

	public IocCollectorAutowiredProps getIocCollector() {
		return iocCollector;
	}

	public void getIocType() {
		System.out.println("IoC Type of IocCollectorAutowiredProps : " + iocType);
	}

	public void setIocType(String iocType) {
		this.iocType = iocType;
	}

	public void notifyThreat() {
		iocCollector.collectIoc();
	}

}
