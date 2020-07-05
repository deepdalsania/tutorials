package com.spring.javabased.lifecycle.callbacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleCallbacks implements InitializingBean, DisposableBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(
				"<---- Bean is initializing throungh afterPropertiesSet(init) method of InitializationBean interface ---->");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("<---- Bean is destroyed now through destroy method of DisposableBean interface ---->");
	}

	public void init() {
		System.out.println("<---- Bean is initializing through user defined init method ---->");
	}

	public void cleanup() {
		System.out.println("<---- Bean is destroyed now through user defined cleanup method ---->");
	}
}
