package com.grotech.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c = new ArrayList<>();
		
		int a = 123; //Gets converted to Integer
		
		List<String> li = new ArrayList<String>(); //Autoboxing
		//li.add(a);
		li.add("Hello");
		
		System.out.println(li);
		
		List<String> li1 = new ArrayList<String>(li);
		List<String> li2 = new ArrayList<String>(50);	
		
		//Add elements 
		li.add("Grotech");
		li.add("Prveen");
		li.add("Megha");
		li.add("Sarvesh");
		System.out.println(li);
		
		li1.add("Grotech1");
		li1.add("Prveen1");
		li1.add("Megha1");
		li1.add("Sarvesh1");
		li1.addAll(li);
		System.out.println(li1);
		
	}
}
