package com.grotech.basics;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If - Statement
		Integer a = 10;
		if(a >=5) {
			//System.out.println("IF: If Condition is true!!");
		}
		
		if(a ==5) {
			//System.out.println("IF-ELSE: If Condition is true!!");
		} else {
			//System.out.println("IF-ELSE: Else Condition is true!!");
		}
		
		
		if(a>=1) {
			//System.out.println("IF-ELSEIF-ELSE: If Condition is true - 1!!");
		}
		else if(a==2) {
			//System.out.println("IF-ELSEIF-ELSE: If Condition is true - 2!!");
		}
		else if(a==3) {
			//System.out.println("IF-ELSEIF-ELSE: If Condition is true - 3!!");
		}
		else if(a==10) {
			//System.out.println("IF-ELSEIF-ELSE: If Condition is true - 10!!");
		} else {
			//System.out.println("IF-ELSEIF-ELSE: Else Condition is true!!");
		}
		
		
		String school = "KV";
		//Nested If
		if (a == 1) {
			if(school.equals("KV")) {
				//System.out.println("Inside the case of KV");
			} else if(school.equals("DAV")) {
				//System.out.println("Inside the case of DAV");
			} else if(school.equals("DPS")) {
				//System.out.println("Inside the case of DPS");
			} else {
				//System.out.println("Inside the ELSE case");
			}
		} else {
			//System.out.println("Inside the ELSE case - Outer");
		}
		
		
		
		
		//Switch Statement
		int marksObtained = 33;
		switch(marksObtained) {
		case 33:
			System.out.println("Marks Got is a Pass Marks");
			break;
		case 50:
			System.out.println("Marks Got is 50 Marks");
			break;
		case 75:
			System.out.println("Marks Got is 75 Marks");
			break;
		default:
			System.out.println("Marks Got is Default");
		}
		//Break brings the control here. 
	}
}
