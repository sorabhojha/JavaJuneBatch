package com.grotech.basics;

public class InstanceInitialiserExample extends InstanceInitialiserExampleParent {

	String name;
	InstanceInitialiserExample(){
		name = "Dummy Value";
		System.out.println("Inside constructor block !!");
	}
	
	{
		System.out.println("Inside initialiser block !!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitialiserExample ex = new InstanceInitialiserExample();
	}
}
