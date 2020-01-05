package com.study.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.study.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	//Match on getter methods
	@Pointcut("execution(* com.study.aopdemo.dao.*.get*(..))") 
	//Match on setter methods
	private void getter() {}
	@Pointcut("execution(* com.study.aopdemo.dao.*.set*(..))") 
	private void setter() {}
	//create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	// this si where we add all of our related advices for logging
	//let's start with @Before advice
	//add Pointcute expression run this code before target
	//method:'public void addAccount()'
//	@Before("execution(public void addAccount())") //Match addAccount() method in any class
//	@Before("execution(public void com.study.aopdemo.dao.AccountDAO.addAccount())") //Match addAccount() method in AccountDAO class
//	@Before("execution(public void add*())") //Match method starting with "add" in any class
//	@Before("execution(public void addAccount(com.study.aopdemo.Account))") //Match addAccount method with param type is Account
	@Before("forDaoPackageNoGetterSetter()") //Match on any dmethods in a package
	public void beforeAddAccountAdvice() {
		System.out.println("\n--------> Executing @Before advice on addAccount()");
	}
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("_____> performing API analytics");
	}
}
