package com.grotech.basics;

public class AnonymousInnerClassExample {

	static String name = "Saurabh";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person() {
			@Override
			void greet() {
				// TODO Auto-generated method stub
				super.greet();
				System.out.println("Greetings from Person Anonymous class: "+name);
			}
		};
		obj.greet();
	}
}


class Person {
	void greet() {
		System.out.println("Greetings from Person");
	}
}
