package com.ba.boost.day16.person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person("Ali", "Cengiz", "K", 25);
		System.out.println(p);
		
		Person p1 = new Person("Ali", "Cengiz", "K", 25); //Different object p1 and p.
		System.out.println(p1);
		
		boolean x = p.equals(p1);
		System.out.println(x);   // If p and p1 only string it can be true.
	}

}
