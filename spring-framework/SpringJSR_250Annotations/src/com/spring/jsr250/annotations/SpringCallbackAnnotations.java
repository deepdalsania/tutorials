package com.spring.jsr250.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringCallbackAnnotations {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println(message);
	}

	/* @PostConstruct annotation as an alternate of initialization callback */
	@PostConstruct
	public void init() {
		System.out.println("Bean is initializing throungh init method");
	}

	/* @PreDestroy annotation as an alternate of destruction callback */
	@PreDestroy
	public void cleanup() {
		System.out.println("Bean is destroyed now throght cleanup method");
	}
}
