package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		BankAccount saving = new Saving();
//		saving.getBalance();
		
//		BankAccount loanAccount = new Loan();
//		loanAccount.getBalance();
//		
//		BankAccount  currentAccount = new Current();
//		currentAccount.getBalance();
		
//		BankAccount account = context.getBean("saving",BankAccount.class);
//		account.getBalance();
		
		/*
		 * BankAccount account2 = context.getBean("current",BankAccount.class);
		 * account2.getBalance();
		 */ 
		
		BankAccount account3 = context.getBean("loan",BankAccount.class);
		account3.getBalance();
		
		
		
	}
}
