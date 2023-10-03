package com.grotech.basics;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vc = new Vector<>();
		vc.add("Test1");
		vc.add("Test2");
		vc.add("Test3");
		vc.add("Test4");
		
		System.out.println(vc);
		
		vc.remove(0);
		vc.remove("Test2");
		System.out.println(vc);
	}
}
