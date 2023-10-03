package com.grotech.basics;

abstract public class AbstractExampleBankingRBI {

	void doPayments() {
		System.out.println("Do payments using NEFT | UPI Technology");
	}
	
	abstract Integer rateOfInterestOnDeposits();
}
