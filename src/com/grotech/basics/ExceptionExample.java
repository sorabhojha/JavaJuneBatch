package com.grotech.basics;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// handle this here
		methodA();
	    //dummy line	
	}
	
	static void methodA(){
		System.out.println("Inside method A");
		// handle this here
		methodB();
		//sdfghjkl
	}
	
	static void methodB() {
		System.out.println("Inside method B");
		// handle this here
		int a =3; 
		int b = 0;
		int x = a/b;
		System.out.println(x);
	}
}
