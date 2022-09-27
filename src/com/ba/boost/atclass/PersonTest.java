package com.ba.boost.atclass;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Alex", "Word", null, 23);
		System.out.println(p);
		
		Person p2 = new Person("Alex", "Word", null, 23);
		System.out.println(p2);
		
		boolean x = p.equals(p2);
		System.out.println(x); 
	}
	

}
