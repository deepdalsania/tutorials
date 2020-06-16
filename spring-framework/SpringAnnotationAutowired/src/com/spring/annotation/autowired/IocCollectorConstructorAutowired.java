package com.spring.annotation.autowired;

public class IocCollectorConstructorAutowired {

	public IocCollectorConstructorAutowired() {
		System.out.println("<---- Inside IocCollectorConstructorAutowired Constructor ---->");
	}

	public void collectIoc() {
		System.out.println("Inside collectIoc method of IocCollectorConstructorAutowired");
	}
}
