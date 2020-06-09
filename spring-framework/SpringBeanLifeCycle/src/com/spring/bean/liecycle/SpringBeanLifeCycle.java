package com.spring.bean.liecycle;

public class SpringBeanLifeCycle {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println(message);
	}

	public void init() {
		System.out.println("Bean is initializing through init method");
	}

	public void cleanup() {
		System.out.println("Bean is destroyed now through cleanup method");
	}
}
