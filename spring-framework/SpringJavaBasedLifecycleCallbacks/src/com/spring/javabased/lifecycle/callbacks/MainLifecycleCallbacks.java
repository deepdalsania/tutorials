package com.spring.javabased.lifecycle.callbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainLifecycleCallbacks {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				LifecycleCallbacksConfig.class)) {
			LifecycleCallbacks lifecycle = context.getBean(LifecycleCallbacks.class);
			lifecycle.setMessage("This is an example of lifecycle callbacks using java based annotation confguration");
			System.out.println(lifecycle.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
