package com.grotech.basics;

class Parent {
	String name;
	Parent(){
		System.out.println("Inside parent constructor");
		name = "Parent Name";
	}
	void printDetails() {
		System.out.println("Name of the parent: "+name);
	}
}

class Child extends Parent {
	String name;
	Child(){
		super();
		System.out.println("Inside child constructor");
		name = "Child Name";
	}
	void printDetails() {
		super.printDetails();
		System.out.println("Name of the child: "+name);
	}
	
	void invoke() {
		printDetails();
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child ch = new Child(); //Constructor chaining
		// Education Board -> School -> Class -> Section -> Student
		ch.invoke();
		
		//Polymorphism & Inheritance
		//Reuse of the code 
		//Only way to access your parent classes 
		
	}
}
