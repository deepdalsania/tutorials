package com.spring.autowire.constructor;

public class IocCollector {

	public IocCollector() {
		System.out.println("Inside IocCollector Constructor");
	}

	public void collectIoc() {
		System.out.println("Inside collectIoc method");
	}
}
