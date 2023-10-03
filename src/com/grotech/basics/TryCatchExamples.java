package com.grotech.basics;

public class TryCatchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//int i = 10/0;
			//int[] arr = {1,2,3};
			//System.out.println(arr[5]);
			throw new PraveenException("UserName is not of the Right format !!");
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | PraveenException e) {
			//Throwable = Errors + Exceptions
			System.out.println("Inside catch block - ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} 
	}
}

class PraveenException extends Exception {
	PraveenException(String ex){
		super(ex);
	}
}
