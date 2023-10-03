package com.grotech.basics;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(5); //Size of the buffer
		sb.append("ExampleStringBuffer");
		
		System.out.println(sb);
		
		String s = "ExampleString";
		StringBuffer sb1 = new StringBuffer(s);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		
		String s1 = "newExample";
		s1 = s1+"Appended";
		System.out.println(s1);
	}
}
