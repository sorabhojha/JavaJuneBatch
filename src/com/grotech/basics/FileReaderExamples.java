package com.grotech.basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//FileReader
		char[] arr = new char[100];
		Reader input = new FileReader("abc.txt");
		System.out.println("Ready to read data? :"+input.ready());
		
		input.read(arr);
		System.out.println(arr);
		
		input.close();
	}
}
