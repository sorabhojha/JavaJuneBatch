package com.grotech.basics;

public class JavaExample {

	String s1 = "Instance Variable";
	public static void main(String[] args) {
		System.out.println("Welcome to the June Batch of Grotech - Development");
		exampleMethod();
	}
	
	public static Integer exampleMethod() {
		String s1 = "Local Variable";
		System.out.println("This is an Example - "+s1);
		return 1;
	}
}

