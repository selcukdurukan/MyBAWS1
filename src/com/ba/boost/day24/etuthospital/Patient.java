package com.ba.boost.day24.etuthospital;

public class Patient extends Person {

	public Patient(String name, String lastName) {
		super(name, lastName);
		this.setJob(Occupation.PATIENT);	
		
	}

	@Override
	public String toString() {
		return "Patient [Name=" + getName() + ", Name=" + getLastName() + ", Job=" + getJob() + "]";
	}
	
	
	
	

}
