package com.spring.factory.di;

public class StaticFactoryOwnClass {

	private static final StaticFactoryOwnClass ownClass = new StaticFactoryOwnClass();
	
	private StaticFactoryOwnClass() {
		System.out.println("Inside Private StaticFactoryOwnClass Constructor");
	}
	
	public static StaticFactoryOwnClass getStaticFactoryOwnClass() {
		System.out.println("Inside getStaticFactoryOwnClass static factory method ");
		return ownClass;
	}
	
	public void message() {
		System.out.println("Message from StaticFactoryOwnClass");
	}
}

