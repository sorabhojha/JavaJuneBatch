package com.grotech.basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

	/*
	 * FileOutputStream
	 * ByteArrayOutputStream
	 * ObjectOutputStream
	 * 
	 * write() - write single byte at a time
	 * write(byte[] array) - entire array content to the output stream.
	 * write(byte[] array, int startIndex, int endIndex.) 
	 * flush() - Flushes the data to Outstream 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutputStream out = null;
		String data = "This is a string from Eclipse";
		
		try {
			out = new FileOutputStream("abc.txt");
			out.write(data.getBytes());
			
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
