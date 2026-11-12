package com.example.code;
class Student
{
	int rollNo;
	String name;
	
	
	
	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}
public class Example74 {
public static void main(String[] args) {
	Student s = new Student();
	s.setName("Khushal");
	s.setRollNo(101);
	System.out.println(s.toString());
}
}
