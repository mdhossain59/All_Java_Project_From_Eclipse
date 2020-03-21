package com.Java;

public class Credit_Card_Eligibility {
	String firstName;
	String lastName;
	int age;
	int doB;
	double income;
	boolean creditCard_Eligibility;
	
	public void creditCardEligibility() {
		if(age >= 25 && income >= 25000.00) {
			creditCard_Eligibility = true;
			
		}
	}

}
