package com.spring.annotation.autowired;

public class IocCollectorAutowiredProps {

	public IocCollectorAutowiredProps() {
		System.out.println("<---- Inside IocCollectorAutowiredProps Constructor ---->");
	}

	public void collectIoc() {
		System.out.println("Inside collectIoc method of IocCollectorAutowiredProps");
	}
}
