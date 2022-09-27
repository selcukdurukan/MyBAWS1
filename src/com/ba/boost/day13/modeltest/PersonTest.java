package com.ba.boost.day13.modeltest;

import com.ba.boost.day13.model.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.firstName = "Ali";
		System.out.println(p1.toString());
		p1.setAge(12);
		System.out.println(p1.getAge());
		
		p1.initialPassword("abc");
		System.out.println(p1.toString());
		String msg = p1.isPasswordCorrect("cde")?"Dogrudur":"Yanlistir";
		
		/*
		 * Same thing with above.
		 * String msg;
		 * if (p1.isPasswordCorrect("cde")) {
		 * 		msg = "Dogrudur"
		 * } else {
		 * 		msg = "Yanlistir"
		 * }
		 */
		System.out.println("Verilen sifre " + msg);
		
		System.out.println(p1.isPasswordCorrect("cde"));
		
		System.out.println(p1.setPassword("abc", "cde"));
		String msg1 = p1.isPasswordCorrect("cde")?"Dogrudur":"Yanlistir";
		System.out.println("Verilen sifre " + msg1);
		

	}

}
