package com.grotech.basics;

public class MobilePhone extends Telephone {
	
	//Works
	//From the class
	//From another class in the same package - Not a subclass
	//From another class in the same package - But a Subclass.
	
	//Does not work
	//Another package
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tp = new Telephone();
		tp.makePhoneCall("123456");
	}
}
