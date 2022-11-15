package com.ba.boost.day18.aggregation;

public class StudentTest {

	public static void main(String[] args) {
		
		Address a = new Address("Istanbul", "Marmara", "Turkey", 81);
		Student s = new Student("Ali", 1507156, a);
		System.out.println(s);
		
		Student s1 = new Student();
		s1.setName("Hakan");
		s1.setRollNo(1500000);
		System.out.println(s1);  
		
		

	}

}
