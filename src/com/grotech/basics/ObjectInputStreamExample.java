package com.grotech.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String s = "Writing from ObjectOutputStream example";	
		
		FileOutputStream os = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(s);
		oos.flush();
	
		
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream objectIs = new ObjectInputStream(fis);
		
		System.out.println(objectIs.readObject());
		objectIs.close();
	}
}
