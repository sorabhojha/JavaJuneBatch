package com.grotech.basics;

import java.util.Set;
import java.util.TreeSet;

class StudentSort implements Comparable<StudentSort> {

	String name;
	int totalMarks;
	
	public StudentSort(String name, int totalMarks) {
		this.name = name;
		this.totalMarks = totalMarks;
	}
	
	@Override
	public int compareTo(StudentSort o) {
		// int value - -1 - 0 - 1
		// TODO Auto-generated method stub
		if(this.totalMarks > o.totalMarks) {
			return -1;
		} else if (this.totalMarks < o.totalMarks) {
			return 1;
		} else {
			return 0;
		}
	}
	
}

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<StudentSort> s = new TreeSet<StudentSort>();
		s.add(new StudentSort("Saurav", 50));
		s.add(new StudentSort("Priyanshu", 60));
		s.add(new StudentSort("Megha", 30));
		s.add(new StudentSort("Praveen", 40));
		
		for (StudentSort ss : s) {
		  System.out.println(ss.name);
		}
	}
}
