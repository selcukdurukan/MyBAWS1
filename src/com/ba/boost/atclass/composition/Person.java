package com.ba.boost.atclass.composition;

public abstract class Person {
	
	private String name; 
	private int ID;
	
	public Person(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + "]";
	}
	
	
	
	
	
}
