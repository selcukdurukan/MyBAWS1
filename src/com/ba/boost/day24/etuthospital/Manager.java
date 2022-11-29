package com.ba.boost.day24.etuthospital;

public class Manager extends Employee implements Acountable{

	public Manager(String name, String lastName, double salary) {
		super(name, lastName, salary);
		this.setJob(Occupation.MANAGER);
	}

	@Override
	public String increaseSalary() {
		double newSalary = getSalary() * 1.4;
		setSalary(newSalary);
		return "New salary is: " + newSalary;
	}
	
	@Override
	public String toString() {
		return "Manager [Salary=" + getSalary() + ", Name=" + getName() + ", LastName=" + getLastName()
				+ ", Job=" + getJob() + "]";
	}



}
