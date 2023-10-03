package com.grotech.basics;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stackOfCars = new Stack<>();
		stackOfCars.push("Alto");
		stackOfCars.push("Mercedez");
		stackOfCars.push("Maserati");
		stackOfCars.push("Creta");
		
		System.out.println(stackOfCars);
		
		System.out.println(stackOfCars.pop());
		System.out.println(stackOfCars);
		
		System.out.println(stackOfCars.pop());
		System.out.println(stackOfCars);
		
		System.out.println(stackOfCars.pop());
		System.out.println(stackOfCars);
		
		//System.out.println(stackOfCars.empty());
		//System.out.println(stackOfCars.search("Mercedez"));
	}
}
