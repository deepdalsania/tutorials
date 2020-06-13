package com.spring.autowire.constructor;

public class ThreatNotifier {

	private IocCollector collector;
	private String iocType;

	public ThreatNotifier(IocCollector collector, String iocType) {
		super();
		this.collector = collector;
		this.iocType = iocType;
	}

	public IocCollector getCollector() {
		return collector;
	}

	public void getIocType() {
		System.out.println("IocType : " + iocType);
	}

	public void notifyThreat() {
		collector.collectIoc();
	}
}
