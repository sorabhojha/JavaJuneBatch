package com.grotech.basics;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Autoboxing
		int a = 5;
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		
		Integer i1 = a; 
		System.out.println(i1);
		
		//Unboxing
		int b = i1.intValue();
		System.out.println(b);
		
		int c = i1;
		System.out.println(b);
	}
}
