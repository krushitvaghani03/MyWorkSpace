package com;

import org.springframework.stereotype.Component;

@Component
public class LoanInfo implements CustomerDetails{

	int amt;
	
	public LoanInfo(int amt) {
		super();
		this.amt = amt;
	}

	public void getBasicInformation() {

		System.out.println("Loan Amount : "+amt);
		
	}
 
	
}
