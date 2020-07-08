package com.spring.custom.event.handling;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
	}

	public String toString() {
		return "This is an example of custom event";
	}

}
