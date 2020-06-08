package com.spring.innerbean.di;

public class ThreatNotifier {

	private IocCollector iocCollector;

	// a setter method to inject the dependency.
	public void setIocCollector(IocCollector iocCollector) {
		System.out.println("Inside Setter of Threat Notifier");
		this.iocCollector = iocCollector;
	}
	
	public IocCollector getIocCollector() {
		return iocCollector;
	}

	public void notifyThreat() {
		iocCollector.collectIoc();
	}
}
