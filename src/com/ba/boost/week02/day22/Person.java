package com.ba.boost.week02.day22;

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

//	public Person() {
//		super();
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", age=" + age + "]";
	}
	
	public void speak() {
		System.out.println("Hi! I'm " + this.name);
	}
}
