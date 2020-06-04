package com.spring.factory.di;

public class StaticFactoryAnotherClass {

	public static StaticFactoryAnotherInterface getStaticFactoryAnotherInterface() {
		return new StaticFactoryA(); //return any one instance, either A or B  
	}
}
