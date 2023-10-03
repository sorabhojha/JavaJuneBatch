package com.grotech.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		char[] arr = new char[100];

		FileReader fr = new FileReader("Grotech.txt");
		fr.read(arr);
		
		System.out.println(arr);
	}
}
