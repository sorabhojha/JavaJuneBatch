package com.grotech.basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new LinkedList<String>();
		li.add("Priyanshu");
		li.add("Priyanshu - II");
		li.add("Priyanshu");
		li.add("Saurabh");
		li.add("Praveen");
		
		
		LinkedList<String> li1 = new LinkedList<>(li);

		Iterator<String> itr = li1.iterator();
		//modifyCount 
		while(itr.hasNext()) {
			String name = itr.next();
			if (name.equals("Praveen")) {
				itr.remove();
			}
		}	
		//System.out.println(li1);	
		
		li1.add(0, "Megha");
		ListIterator<String> itr1 = li1.listIterator();
		while(itr1.hasNext()) {
			String name = itr1.next();
			System.out.println(name);
		}
		
		//ConcurrentModificationException - This occurs when someone is trying to modify the collection while it is being iterated.
		
		Iterator itr2 = li1.descendingIterator();
		while(itr2.hasNext()) {
			String name = (String)itr2.next();
			System.out.println(name);
		}
	}
}
