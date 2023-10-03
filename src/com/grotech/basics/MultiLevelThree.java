package com.grotech.basics;

public class MultiLevelThree extends MultiLevelTwo {

	
	public void greet() {
		//super.greet();
		System.out.println("Inside multi-level inheritance ex - Three");
	}
	
	public void intro() {
		System.out.println("Inside intro method - Three");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MultiLevelTwo three = new MultiLevelThree();
		MultiLevelThree three = new MultiLevelThree();
		three.greet();
		three.intro();
	}
}
