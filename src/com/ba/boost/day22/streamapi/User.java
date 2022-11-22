package com.ba.boost.day22.streamapi;

public class User {

	private int id;
	private String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void talk() {
		System.out.println("Hi, I'm " + getName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}
