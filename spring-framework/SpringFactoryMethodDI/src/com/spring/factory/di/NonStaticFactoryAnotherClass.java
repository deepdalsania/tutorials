package com.spring.factory.di;

public class NonStaticFactoryAnotherClass {

	public NonStaticFactoryAnotherInterface getNonStaticFactoryAnotherInterface() {
		return new NonStaticFactoryB(); //return any one instance, either A or B
	}
}
