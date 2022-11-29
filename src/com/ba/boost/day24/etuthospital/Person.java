package com.ba.boost.day24.etuthospital;

public abstract class Person {
	
	private String name;
	private String lastName;
	private Occupation job;
	
	
	public Person(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}


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


	public Occupation getJob() {
		return job;
	}


	public void setJob(Occupation job) {
		this.job = job;
	}



	
	
	
	
	
	
	
	

}
