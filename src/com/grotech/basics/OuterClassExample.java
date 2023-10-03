package com.grotech.basics;

public class OuterClassExample {

	private String name = "Dummy Class";
	
	private class InnerClass {
		String info = "Inside the inner class";
		void greet () {
			System.out.println(info + " "+ OuterClassExample.this.name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClassExample outer = new OuterClassExample();
		OuterClassExample.InnerClass inner = outer.new InnerClass();
		inner.greet();
	}
}
