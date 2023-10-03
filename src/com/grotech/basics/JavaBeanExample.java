package com.grotech.basics;

public class JavaBeanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBean obj = new StudentBean(null, 0, null);
		System.out.println(obj);
		
		obj.setName("Saurabh");
		obj.setRoll_no(13);
		obj.setSchoolName("KV");
		
		System.out.println(obj);
	}
}


class StudentBean {
	private String name;
	private int roll_no;
	private String schoolName;
	
	public StudentBean(String name, int roll_no, String schoolName) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.schoolName = schoolName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", roll_no=" + roll_no + ", schoolName=" + schoolName + "]";
	}
}