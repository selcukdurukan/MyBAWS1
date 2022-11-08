package com.ba.boost.day16.superkeyword;

public class Dog extends Animal{
	
	String color = "Black";
	
	void printColor() {
		System.out.println(super.color);
		System.out.println(color);
	}
			
}
