package com.ba.boost.day64and65.newdeneme3;

public class Person {
	
	private String name;
	private Boolean isActive;
	
	
	public Person(String name, Boolean isActive) {
		super();
		this.name = name;
		this.isActive = isActive;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", isActive=" + isActive + "]";
	}
	
	
	
	
	
	
	
	

}
