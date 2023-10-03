package com.grotech.basics;

public class HierarchialChildTwo extends HierarchialOneParent {

	public void greet() {
		super.greet();
		System.out.println("Greeting from ChildTwo !!");
	}
	
	public static void main(String[] args) {
		HierarchialChildTwo co = new HierarchialChildTwo();
		co.greet();
	}
}
