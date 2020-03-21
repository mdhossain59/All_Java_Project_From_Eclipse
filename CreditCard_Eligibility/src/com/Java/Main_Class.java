package com.Java;

public class Main_Class {

	public static void main(String[] args) {
		Credit_Card_Eligibility md = new Credit_Card_Eligibility();
		md.firstName = "Mohammad";
		md.lastName = " Hossain";
		md.age = 32;
		md.income = 4000.98;
		md.doB = 10_24_1986;
		md.creditCardEligibility();
		System.out.println(" Is Md eligible for credit card " +md.creditCard_Eligibility);
		// another account holder.
	
		Credit_Card_Eligibility farhana = new Credit_Card_Eligibility();
		
		farhana.firstName = "Farhana";
		farhana.lastName = " Parvin";
		farhana.age = 21;
		farhana.income = 24000.98;
		farhana.doB = 7_18_1999;
		farhana.creditCardEligibility();
		System.out.println(" Is Md eligible for credit card " +farhana.creditCard_Eligibility);
	
		
	// 3rd account holder.
	Credit_Card_Eligibility sub = new Credit_Card_Eligibility();
	sub.firstName = "Mohammad";
	sub.lastName = " Raihan";
	sub.age = 28;
	sub.income = 44000.98;
	sub.doB = 10_24_1986;
	sub.creditCardEligibility();
	System.out.println(" Is Md eligible for credit card " +sub.creditCard_Eligibility);

	}
}
