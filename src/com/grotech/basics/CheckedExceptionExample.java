package com.grotech.basics;

import java.io.File;
import java.io.FileInputStream;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("\\D:\\Folder1");
		FileInputStream fis = new FileInputStream(file);
	}
}
