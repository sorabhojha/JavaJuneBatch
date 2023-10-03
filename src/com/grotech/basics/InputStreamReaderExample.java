package com.grotech.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

	//Convert data in bytes/byte array format to characters
	//Bridge the gap between bytes and characters.
	
	public static void main(String[] args) throws IOException {
		
		char[] array = new char[100];
		FileInputStream file = new FileInputStream("Grotech.txt");
		InputStreamReader isr = new InputStreamReader(file);
		
		isr.read(array);
		System.out.println(array);
	}
}
