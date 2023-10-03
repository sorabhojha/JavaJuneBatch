package com.grotech.basics;

public class ReverseOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome"; //7 characters - 7  -- length - Count the number of characters - {0='W', 1='e', 2='l', 3='c', 4='o', 5='m', 6='e'}
		ReverseOfAString rs = new ReverseOfAString();
		String reversedString = rs.reverse(s);
		System.out.println(reversedString);
	}

	private String reverse(String s) {
		// TODO Auto-generated method stub
		// Length
		// For loop/While loop - Reverse order
		
		//for(initialisation | condition | increment/Decrement)
		int length = s.length();
		String reversed = "";
		for(int i = length-1; i>=0; i--) {
			reversed = reversed + s.charAt(i); // reversed = "e" | "em" | "emo"
		}
		
		return reversed;
	}
}
