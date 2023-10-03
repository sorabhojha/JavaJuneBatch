package com.grotech.basics;

public class StaticOuterClass {

	static int id = 5;
	static private String name = "Outer class";
	static class Inner {
		static void printId() {
			System.out.println("ID is: "+id+ "Name: "+name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOuterClass.Inner.printId();
		StaticOuterClass obj = new StaticOuterClass();
	}
}

/*--
Normal : Without the outer class - Inner classes can not exist
Static : Not the case here. Can access without the instance of outer class.

Normal : All the members of the outer class, i.e static, non static, private etc etc can be accessed by the inner class
Static classes: Only static members can be accessed. 
--*/