package com.ba.boost.day24.etuthospital;

public abstract class Employee extends Person{
	
	private double salary;

	public Employee(String name, String lastName, double salary) {
		super(name, lastName);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	
	
	
	
	

}
