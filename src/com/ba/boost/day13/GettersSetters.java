package com.ba.boost.day13;

public class GettersSetters {
	
	private String name;
	public String lastName;
	private final String id = "2312131212"; // İf this final, we cannot create setId.
	
	
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
	public String getId() {
		return id;
	}


}
