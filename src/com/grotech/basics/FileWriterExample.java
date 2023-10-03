package com.grotech.basics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String data = "Hello !! Welcome to Grotech minds";
		
		Writer output = new FileWriter("Grotech.txt");
		output.write(data);
		
		output.close();
	}
}
