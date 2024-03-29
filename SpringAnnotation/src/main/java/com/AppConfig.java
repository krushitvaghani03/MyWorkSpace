package com;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class AppConfig {

	Scanner sc = new Scanner(System.in);

	
	  @Bean("basicInfo") public BasicInfo setData() {
	  System.out.println("Enter Id :"); int id = sc.nextInt();
	  
	  System.out.println("Enter Name :"); String name = sc.next();
	  
	  return new BasicInfo(id,name); }
	  
	  @Bean("addressInfo") public AddressInfo setdetails() {
	  System.out.println("Enter City :"); String city = sc.next();
	  
	  System.out.println("Enter Pin :"); String pin = sc.next();
	  
	  return new AddressInfo(city, pin); }
	  
	 
	/*
	 * @Bean("loanInfo") public LoanInfo setAmt() {
	 * System.out.println("Enter Loan Amount : "); int amt = sc.nextInt();
	 * 
	 * return new LoanInfo(amt); }
	 */

}
