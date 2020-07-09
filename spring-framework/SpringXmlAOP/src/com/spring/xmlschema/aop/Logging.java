package com.spring.xmlschema.aop;

public class Logging {

	/* execute before selected method execution */
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	/* execute after selected method execution */
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	/* execute when any method returns */
	public void afterReturningAdvice(Object retValue) {
		System.out.println("Returning : " + retValue.toString());
	}

	/* execute if there is an exception raised */
	public void afterThrowingAdvice(IllegalArgumentException e) {
		System.out.println("Exception Occured! : " + e.toString());
	}

}
