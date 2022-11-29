package com.ba.boost.day24.iostream;

import java.io.Serializable;

public class Dog implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = -7352475728809983119L;
	private String name;
	private String breed;
	
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	
	
	
	

}
