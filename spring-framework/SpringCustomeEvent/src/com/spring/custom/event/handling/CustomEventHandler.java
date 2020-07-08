package com.spring.custom.event.handling;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent ce) {
		System.out.println(ce.toString());
	}

}
