package com.grotech.basics;

import java.io.IOException;
import java.io.StringReader;

public class StringReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char[] array = new char[100];
		String s1 = "I am being read by StringReader";
		StringReader sr = new StringReader(s1);
		
		sr.read(array);
		System.out.println(array);
	}
}
