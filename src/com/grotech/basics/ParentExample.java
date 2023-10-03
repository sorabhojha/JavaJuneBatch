package com.grotech.basics;

public class ParentExample {

	Integer int1;
	
	public ParentExample(Integer int1) {
		this.int1 = int1;
	}
	public void greet() {
		System.out.println("Inside Parent Example Greet method!! "+ int1);
	}
}
