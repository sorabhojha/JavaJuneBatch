package com.grotech.basics;

public class Telephone {

	String type;
	
	public void makePhoneCall(String number) {
		System.out.println("Calling number: " + number);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone tp1 = new Telephone();
		tp1.makePhoneCall("8904479652");
	}
}
