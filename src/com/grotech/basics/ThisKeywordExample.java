package com.grotech.basics;

public class ThisKeywordExample {

	//this - Keyword - Reference variable
	//Refers to the current object instance
	//Can be used to call - methods/variables | constructor | differentiate between local and instance variables
	
	String name;
	String section;
	
	
	public ThisKeywordExample() {
		this.section = "A";
		System.out.println("Inside default constructor");
	}
	
	ThisKeywordExample(String name){	
		this(); // Calling default cons. - Always in the first line in the constructor. 
		System.out.println("Inside parametrised constructor");
		this.name = name;
		printHelloWorld(this);
	}

	public void printHelloWorld(ThisKeywordExample obj) {
		System.out.println("Hello, welcome to programming classes: "+ obj.name+ " Section: "+obj.section);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordExample tke = new ThisKeywordExample("Dummy Name");
		ThisKeywordExample tke1 = new ThisKeywordExample("Dummy Name");
		ThisKeywordExample tke2 = new ThisKeywordExample("Dummy Name");
		ThisKeywordExample tke3 = new ThisKeywordExample("Dummy Name");
	}
	
	//'this' -> current class instance
	//'this()' -> constructor -> Arguments
	//this -> Return class instance
	//this -> accept class instance as a method parameter.
	//this -> invoke variables/Methods of current class
	
}
