package com.grotech.basics;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialisation
		//Condition
		//Increment/Decerement
		//Statement
		for(int i =0; i<=25; i++) {
			//System.out.println("Hello From Grotech !!");
		}
		
		// {1,2,3,4,5,6} - myArray[n] - int n = 0;
		
		int[] myArray = {1,2,3,4,5,6,7,8}; // length = 8 myArray[8]
		
		int lengthOfArray = myArray.length;
		
		for (int i=0; i<= lengthOfArray-1; i++) {
			//System.out.println(myArray[i]);
		}
		//System.out.println("Element at index 4: "+myArray[4]);
		
		
		//Nested for loop.
		
		String[][] sectionsStudents = {
				                       {"Saurav","Priyanshu","Raj"}, 
									   {"Usha","Sarvesh","Praveen"}
		                              };
		for (int i=0; i<=1; i++) { //Iteration of the section
			for (int j=0; j<=2; j++) { //Iteration of each student in a section
				//System.out.println(sectionsStudents[i][j]);
			}
		}
		
		
		int[] marksInATest = {35, 54, 70, 90, 68};
		for(int x : marksInATest) {
			//System.out.println("Fetched Marks:"+x);
		}
		
		//While Loops
		int a = 0;
		while (a<=5) {
			//System.out.println(a);
			a++;
		}
		
		
		
		//Do-While Loop
		int b = 0;
		do {
			//System.out.println("I run at least once !!"+b);
			b++;
		} while(b<=5);
		
		
		//break - keyword
		//int[] myArray = {1,2,3,4,5,6,7,8};
		for (int i=0; i<= lengthOfArray-1; i++) {
			if (myArray[i] == 5) {
				continue;
			}
			//System.out.println(myArray[i]);
		}
		//Break control comes here. 
		//continue
		
		//10
		//{2,4,6,8,10,12,14,16,18,20}	
	}
}
