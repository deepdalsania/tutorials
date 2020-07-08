package com.spring.even.handling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent startEvent) {
		/*
		 * you can poll database or restart application after receiving this event or
		 * load some initial items
		 */
		System.out.println("<---- ContextStartedEvent is calling ----.");
		System.out.println("Timestamp : " + startEvent.getTimestamp());

	}

}
