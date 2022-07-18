package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Saving implements BankAccount {

	@Autowired
	@Qualifier("basicInfo")
	CustomerDetails customerDetails;
	
	public void getBalance() 
	{
		System.out.println("This is a Saving Account!!!");
		customerDetails.getBasicInformation();
	}

	
}
