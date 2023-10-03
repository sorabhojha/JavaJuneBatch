package com.grotech.basics;

public class FinalKeyword extends FinalKeywordParent{

	final Integer a;
	
	public FinalKeyword(int x) {
		// TODO Auto-generated constructor stub
		a = x;
	}

	@Override
	public void greetEveryone() {
		System.out.println("Greetings from Child class for final example");
	}
	
	private void print() {
		// TODO Auto-generated method stub
		System.out.println(a);
		greetEveryone();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword obj = new FinalKeyword(5);
		obj.print();
		
	}
}
