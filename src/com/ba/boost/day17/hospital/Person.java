package com.ba.boost.day17.hospital;

public abstract class Person {
	
	private String name;
	private boolean isHealthy;
	private int age;
	
	abstract void examination();
	
	public Person(String name, boolean isHealthy, int age) {
		super();
		this.name = name;
		this.isHealthy = isHealthy;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHealthy() {
		return isHealthy;
	}
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", isHealthy=" + isHealthy + ", age=" + age + "]";
	}
	
	
	
	
	

}
