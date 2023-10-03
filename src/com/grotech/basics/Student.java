package com.grotech.basics;

public class Student {

	int roll_no;
	String name;
	String class_section;
	
	Student() {
		class_section = "1-A";
	}
	
	Student(Integer roll, String name_st, String class_sec){
		roll_no = roll;
		name = name_st;
		class_section = class_sec;
	}
	
	
	 Student(Student obj){ 
		 roll_no = obj.roll_no; 
		 name = obj.name; 
		 class_section = obj.class_section; 
	 }
		
	public void getStudentDetails() {
		System.out.println("Name: "+name+"Roll No: "+roll_no+"Class Section: "+class_section);
	}
	
	public void setStudentDetails(Integer roll, String name_student) {
		roll_no = roll;
		name = name_student;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		Student obj1 = new Student();
		
		obj.setStudentDetails(1,"Megha");
		obj.getStudentDetails();
		
		obj.setStudentDetails(2,"Raj");
		obj1.getStudentDetails();
		
		Student obj2 = new Student(3, "Sorabh", "2-B");
		obj2.getStudentDetails();
		
		Student obj3 = new Student(obj2);
		obj3.getStudentDetails();
	}
}
