package com.spring.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class ThreatNotifierSetterAutowired {

	private IocCollectorSetterAutowired iocCollector;
	private String iocType;

	@Autowired
	public void setIocCollector(IocCollectorSetterAutowired collector) {
		System.out.println("<---- IocCollectorSetterAutowired ---->");
		this.iocCollector = collector;
	}

	public IocCollectorSetterAutowired getIocCollector() {
		return iocCollector;
	}

	public void getIocType() {
		System.out.println("IoC Type of IocCollectorSetterAutowired : " + iocType);
	}

	public void setIocType(String iocType) {
		this.iocType = iocType;
	}

	public void notifyThreat() {
		iocCollector.collectIoc();
	}
}
