package com.study.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public void addAccount() {
		System.out.println(getClass() + "getClass() Doting Memeber shhip accout");
	}
	public void goToSleep() {
		System.out.println(getClass() + ": GOING TO SLEEP");
	}
}
