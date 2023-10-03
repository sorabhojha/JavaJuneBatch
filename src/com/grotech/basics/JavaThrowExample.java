package com.grotech.basics;

public class JavaThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 10;
		if (age<20) {
			//getMessage()
			//printStackTrace()
			throw new ArithmeticException("Age format is not appropriate.");
		} 
	}
}
