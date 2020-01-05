package com.study.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	public void doWork() {
		System.out.println(getClass() + ": DOING MY DB WORK: DOING WORK");
	}
}
