package com.ba.boost.day22.HWstreamapiperson;

public class Person {

	private String name;
	private String lastName;
	private Character gender;  //M or F
	private int age;
	
	public Person(String name, String lastName, Character gender, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("Hi! I'm " + this.name);
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Character getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
	}


	

}
