package com.study.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.aopdemo.dao.AccountDAO;
import com.study.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		//call the business method
		theAccountDAO.addAccount();
		theAccountDAO.doWork();
	
		//get membeship bean from spring container
		MembershipDAO theMemebershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		// call the membership business method
		theMemebershipDAO.addAccount();
		theMemebershipDAO.goToSleep();
		//close the context
		context.close();
	}

}
