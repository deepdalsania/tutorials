package com.spring.scope;

public class SingletonScope {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println(message);
	}
}
