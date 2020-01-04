package com.study.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	// this si where we add all of our related advices for logging
	//let's start with @Before advice
	//add Pointcute expression run this code before target
	//method:'public void addAccount()'
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n--------> Executing @Before advice on addAccount()");
	}
}
