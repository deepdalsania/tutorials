package com.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleInterface implements InitializingBean, DisposableBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println(message);
	}

	/*
	 * If we are implementing InitializingBean, DisposableBean interfaces then we
	 * don't need to mention init-method and destroy-method in XML configuration
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is initializing through afterPropertiesSet method of InitializingBean interface");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is destroyed now through destroy method of DisposableBean interface");
	}

}
