package com.spring.factory.di;

public class NonStaticFactoryA implements NonStaticFactoryAnotherInterface {

	@Override
	public void print() {
		System.out.println("Message from NonStaticFactoryA");
	}

}
