package com.grotech.basics;

public interface ConstantsInterfaceExample {
	Integer noOfDaysInAWeek = 7;
	
	void greet();
	
	default void defaultMethodExample() {
		System.out.println("Inside a default method");
	}
}
