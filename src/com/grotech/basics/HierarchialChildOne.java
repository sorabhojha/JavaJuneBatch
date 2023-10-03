package com.grotech.basics;

public class HierarchialChildOne extends HierarchialOneParent {

	public void greet() {
		super.greet();
		System.out.println("Greeting from ChildOne !!");
	}
	
	public static void main(String[] args) {
		HierarchialChildOne co = new HierarchialChildOne();
		co.greet();
	}
}
