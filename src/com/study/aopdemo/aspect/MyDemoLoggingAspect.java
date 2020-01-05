package com.study.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {
	
	
	// this si where we add all of our related advices for logging
	//let's start with @Before advice
	//add Pointcute expression run this code before target
	//method:'public void addAccount()'
//	@Before("execution(public void addAccount())") //Match addAccount() method in any class
//	@Before("execution(public void com.study.aopdemo.dao.AccountDAO.addAccount())") //Match addAccount() method in AccountDAO class
//	@Before("execution(public void add*())") //Match method starting with "add" in any class
//	@Before("execution(public void addAccount(com.study.aopdemo.Account))") //Match addAccount method with param type is Account
	@Before("com.study.aopdemo.aspect.StudyAOPExpressions.forDaoPackageNoGetterSetter()") //Match on any dmethods in a package
	public void beforeAddAccountAdvice() {
		System.out.println("\n--------> Executing @Before advice on addAccount()");
	}
	
}
