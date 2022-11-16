package com.ba.boost.day18.school;

public class SchoolTest {

	public static void main(String[] args) {
		
		Course math = new Course("Mathematics", 151237458);
		Course eng = new Course("English", 1751237478);
		
		Address sA = new Address("Nigde", "Candan", 51200);
		Address tA = new Address("Kagithane", "Harzem", 34100);
		
		Student s = new Student("Ali Cenk", 383, sA, eng);
		Teacher t = new Teacher("Jack London", 161, tA, math);
		
		System.out.println(s);
		System.out.println(t);
		
		

	}

}
