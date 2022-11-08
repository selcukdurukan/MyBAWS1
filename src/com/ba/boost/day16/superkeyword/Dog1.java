package com.ba.boost.day16.superkeyword;

public class Dog1 extends Animal1{
	
	void eat() {
		System.out.println("eating kuru mama");
	}
	
	void bark() {
		System.out.println("hav hav hav");
	}
	
	void runner() {
		super.eat();
		this.bark();
		this.eat();
		
	}
	

}
