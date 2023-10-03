package com.grotech.basics;

public class Torch {

	String colorOfLight = "Yellow";
	
	public void lightUp() {
		System.out.println("Torchlight Glowing !!");
	}
	
	public void lightUp(String a) {
		System.out.println("Torchlight Glowing !!"+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Torch t1 = new Torch();
		System.out.println(t1.colorOfLight);
		t1.lightUp();
		
		String x = "MyNewTorch";
		t1.lightUp(x); //t1.lightUp("BlaBla");
		
		System.out.println("Inside main method");
	}
}
