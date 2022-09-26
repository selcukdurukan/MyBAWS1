package com.ba.boost.week02.atclass.hospital;

public abstract class Person {

	private String name;
	private boolean isHealty;
	private int age;

	public Person(String name, boolean isHealty, int age) {
		this.name = name;
		this.isHealty = isHealty;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHealty() {
		return isHealty;
	}

	public void setHealty(boolean isHealty) {
		this.isHealty = isHealty;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", isHealty=" + isHealty + ", age=" + age + "]";
	}

}
