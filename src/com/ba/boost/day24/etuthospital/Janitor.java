package com.ba.boost.day24.etuthospital;

public class Janitor extends Employee implements Acountable{

	public Janitor(String name, String lastName, double salary) {
		super(name, lastName, salary);
		this.setJob(Occupation.JANITOR);
	}

	@Override
	public String increaseSalary() {
		double newSalary = getSalary() * 1.1;
		setSalary(newSalary);
		return "New salary is: " + newSalary;
	}
	
	@Override
	public String toString() {
		return "Janitor [Salary=" + getSalary() + ", Name=" + getName() + ", LastName=" + getLastName()
				+ ", Job=" + getJob() + "]";
	}



}
