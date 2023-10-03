package com.grotech.basics;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Inside Try block !!");
			int[] arr = {1,2,3};
			int h = arr[45];
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Handling Arithmetic Exception !!");
			ex.printStackTrace();
			try {
				int b = 2/0;
			}catch(Exception x) {
				System.out.println("Inside 2nd Catch");
			}
		} finally {
			try {
				int x = 10/0;
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println("Inside catch of the finally block !!");
			}
			System.out.println("Closing Database connections");
		}
	}
}
