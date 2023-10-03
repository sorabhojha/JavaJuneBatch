package com.grotech.basics;

public class AbstractExampleBankingHDFC extends AbstractExampleBankingRBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExampleBankingRBI obj = new AbstractExampleBankingHDFC();
		obj.doPayments();
		System.out.println(obj.rateOfInterestOnDeposits());
	}

	@Override
	Integer rateOfInterestOnDeposits() {
		// TODO Auto-generated method stub
		return 8;
	}
}
