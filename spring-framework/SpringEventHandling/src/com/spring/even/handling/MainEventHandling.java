package com.spring.even.handling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEventHandling {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(
				EvenHandlingConfig.class)) {
			// event started
			context.start();
			HelloWorld helloWorld = context.getBean(HelloWorld.class);
			helloWorld.setMessage("This is an example of event handling in spring");
			System.out.println(helloWorld.getMessage());
			// event stopped
			context.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
