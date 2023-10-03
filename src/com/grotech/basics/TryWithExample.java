package com.grotech.basics;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileReader fr = new FileReader("\\D:\\abc.txt");
			BufferedReader br = new BufferedReader(fr))
		{
			System.out.println("Inside the try block");
		} catch(Exception ex) {
			System.out.println("Inside exception handler");
			ex.printStackTrace();
		}
	}
}
