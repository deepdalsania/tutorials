package com.spring.factory.di;

public class StaticFactoryB implements StaticFactoryAnotherInterface {

	@Override
	public void print() {
		System.out.println("Message from StaticFactoryB");
	}

}
