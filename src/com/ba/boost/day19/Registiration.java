package com.ba.boost.day19;

public class Registiration {
	
	long registirationNumber;
	String name;
	String department;
	int year;
	
	
	public Registiration(long registirationNumber, String name, String department, int year) {
		super();
		this.registirationNumber = registirationNumber;
		this.name = name;
		this.department = department;
		this.year = year;
	}


	@Override
	public String toString() {
		return "Registiration [registirationNumber=" + registirationNumber + ", name=" + name + ", department="
				+ department + ", year=" + year + "]";
	}
	
	
	
	
	
}
