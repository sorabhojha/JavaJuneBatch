package com.grotech.basics;

public class ArraysProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reversing the order of elements
		int[] a = {10,1,5,1,8,2,7,3,4};
		for (int i = a.length-1; i>=0; i--) {
			//System.out.println(a[i]);
		}
		
		
		
		//Minimum in an Array
		int minimumNumber = a[0];
		for (int i=0; i<= a.length-1; i++) {
			if(a[i]< minimumNumber) {
				minimumNumber = a[i];
			}
		}
		System.out.print("Minimum Number: "+minimumNumber);
	}
}
