package com.spring.javabased.configuration.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainHelloWorld {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
			HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
			helloWorld.setMessage("This is a HelloWorld example using java based configuration");
			helloWorld.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
