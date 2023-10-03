package com.grotech.basics;

import java.util.HashSet;
import java.util.Set;

public class HashSetEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> s1 = new HashSet(10,0.80f);
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(3);
		System.out.println(s1);
		
		HashSet<Integer> s2 = new HashSet(10,0.80f);
		s2.add(1);
		s2.add(3);
		s2.add(4);
		s2.add(5);
		s2.add(null);
		s2.add(null);
		System.out.println(s2);
		
		//Union of sets
		// addAll - method - used for unions
		//s2.addAll(s1);
		//System.out.println(s2);
		
		//Intersection
		//s2.retainAll(s1);
		//System.out.println(s2);
		
		//Difference of sets 
		//s2.removeAll(s1);
		s1.removeAll(s2);
		System.out.println(s1);
		
	}
}
