package com.grotech.basics;

public class StaticExample {
	
	static String name = "Example Name";
	Integer rollId;

	//Executed First
	static {
		System.out.println("Loaded from Static block");
		name = "Sarvesh";
	}
	
	public StaticExample() {
		// TODO Auto-generated constructor stub
		System.out.println("Loaded from Constructor block");
	}
	
	static void getName() {
		System.out.println("Name value is: "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Second thing executed
		System.out.println(StaticExample.name);
		StaticExample.getName();
	}
}
