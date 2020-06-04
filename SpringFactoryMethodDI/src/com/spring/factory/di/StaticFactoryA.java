package com.spring.factory.di;

public class StaticFactoryA implements StaticFactoryAnotherInterface{

	@Override
	public void print() {
		System.out.println("Message from StaticFactoryA");	
	}

}
