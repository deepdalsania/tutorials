package com.spring.aspectj.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

	/*
	 * Following is the definition for a pointcut to select all the methods
	 * available. So advice will be called for all the methods
	 */
	@Pointcut("execution(* com.spring.aspectj.aop.*.*(..))")
	public void selectAll() {
	}

	/* execute before selected method execution */
	@Before(value = "selectAll()")
	public void beforeAdvice() {
		System.out.println("Going to setup student profile.");
	}

	/* execute after selected method execution */
	@After(value = "selectAll()")
	public void afterAdvice() {
		System.out.println("Student profile has been setup.");
	}

	/* execute when any method returns */
	@AfterReturning(pointcut = "selectAll()", returning = "retValue")
	public void afterReturningAdvice(Object retValue) {
		System.out.println("Returning : " + retValue.toString());
	}

	/* execute if there is an exception raised */
	@AfterThrowing(pointcut = "selectAll()", throwing = "e")
	public void afterThrowingAdvice(IllegalArgumentException e) {
		System.out.println("Exception Occured! : " + e.toString());
	}

}
