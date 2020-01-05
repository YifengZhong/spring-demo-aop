package com.study.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudyAOPExpressions {
	@Pointcut("execution(* com.study.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	//Match on getter methods
	@Pointcut("execution(* com.study.aopdemo.dao.*.get*(..))") 
	//Match on setter methods
	public void getter() {}
	@Pointcut("execution(* com.study.aopdemo.dao.*.set*(..))") 
	public void setter() {}
	//create pointcut: include package ... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}

}
