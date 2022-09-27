package com.ba.boost.day13.model;

public class Course {

	private String name;
	private Person student;
	private Person teacher;
	
	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.name = "java";
		c1.student.firstName = "Ali";
		c1.student.lastName = "Veli";
		
		
		Course c2 = new Course();
		
		c2.name =".Net";
	}
}
