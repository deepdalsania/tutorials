package com.spring.factory.di;

public class NonStaticFactoryB implements NonStaticFactoryAnotherInterface {

	@Override
	public void print() {
		System.out.println("Message from NonStaticFactoryB");
	}

}
