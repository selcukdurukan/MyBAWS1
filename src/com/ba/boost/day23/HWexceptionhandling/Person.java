package com.ba.boost.day23.HWexceptionhandling;

import java.io.Serializable;

public class Person implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = -2631748262539919890L;
	private String name;
	private String gender;
	
	
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	public void manCheck(String msg) throws ManException {
		
		if (this.gender.equalsIgnoreCase("F")) {
			System.out.println(msg);
		} else {
			throw new ManException();
		}
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	
	

}
