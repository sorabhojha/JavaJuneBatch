package com.grotech.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	// 8192 characters - Keep with itself in the buffer
	// Queries the disak and stores the data in an internal buffer.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char[] arr = new char[100];
		FileReader file = new FileReader("Grotech.txt");
		BufferedReader bfr = new BufferedReader(file);
		
		bfr.read(arr);
		System.out.println(arr);
	}
}
