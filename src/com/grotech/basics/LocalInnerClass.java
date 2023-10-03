package com.grotech.basics;

public class LocalInnerClass {

	void innerClass() {
		System.out.println("Inside innerClass method");
		class LocalInner {
			void greet() {
				System.out.println("Hi !! Calling from the method local greet");
			}
		}
		LocalInner linner = new LocalInner();
		linner.greet();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass li = new LocalInnerClass();
		li.innerClass();
	}
}
