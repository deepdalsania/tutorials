package com.spring.even.handling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent stopEvent) {
		/* You can do required housekeep work after receiving this event. */
		System.out.println("<---- ContextStoppedEvent is calling ---->");
		System.out.println("Timestamp : " + stopEvent.getTimestamp());
	}

}
