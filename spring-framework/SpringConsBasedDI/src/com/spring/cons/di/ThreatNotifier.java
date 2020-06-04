package com.spring.cons.di;

public class ThreatNotifier {

	/*
	 * If we are going to build threat intelligence then out ThreatNotifier is
	 * depend on IOCCollector. Here IOC means Indicator of Compromises. It can be
	 * IP,Domain,URL etc.
	 */
	private IocCollector collector;

	public ThreatNotifier(IocCollector collector) {
		System.out.println("Inside Threat Notifier Constructor");
		this.collector = collector;
	}

	public void notifyThreat() {
		collector.collectIoc();
	}
}
