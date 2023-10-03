package com.grotech.basics;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Inside Try block");
			int x = 10/0;
		} catch(Exception ex ) {
				System.out.println("Its a Normal Exception");
		} catch(ArithmeticException ex ) {
			System.out.println("Its an Arithmetic Exception");
		} 
		finally {
			//Cleanup
			System.out.println("Inside the finally Block");
		}
	}
}
