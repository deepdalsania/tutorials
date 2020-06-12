package com.spring.autowire.byname;

public class ThreatNotifier {

	private IocCollector iocCollector;
	private String iocType;

	// a setter method to inject the dependency.
	public void setIocCollector(IocCollector collector) {
		this.iocCollector = collector;
	}

	public IocCollector getIocCollector() {
		return iocCollector;
	}

	public void getIocType() {
		System.out.println("IoC Type : " + iocType);
	}

	public void setIocType(String iocType) {
		this.iocType = iocType;
	}

	public void notifyThreat() {
		iocCollector.collectIoc();
	}
}
