package com.ba.boost.day18.school;

public abstract class Person {
	
	private String name;
	private int id;
	private Address address;
	private final Course course;
	
	
	public Person(String name, int id, Address address, Course course) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.course = course;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Course getCourse() {
		return course;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", address=" + address + ", course=" + course + "]";
	}
	
	
	
	
	
	
	

}
