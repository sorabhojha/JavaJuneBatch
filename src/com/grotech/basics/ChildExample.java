package com.grotech.basics;

public class ChildExample extends ParentExample{

	Integer int1;
	public ChildExample(Integer int1, Integer int2) {
		super(int1);
		this.int1 = int2;
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		super.greet();
		System.out.println("Greetings from child !!"+ int1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildExample ex = new ChildExample(1,2);
		ex.greet();
	}
}
