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
		System.out.println("Bean is initializing throungh init method");
	}

	public void cleanup() {
		System.out.println("Bean is destroyed now throght cleanup method");
	}
}
