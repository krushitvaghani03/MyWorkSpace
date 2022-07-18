package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Loan implements BankAccount {

	@Autowired
	@Qualifier("addressInfo")
	CustomerDetails customerDetails;
	
	public void getBalance() {

		System.out.println("This is Loan Account!!!");
		customerDetails.getBasicInformation();
	}

}
