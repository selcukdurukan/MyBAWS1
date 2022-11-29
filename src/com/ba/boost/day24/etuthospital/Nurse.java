package com.ba.boost.day24.etuthospital;

public class Nurse extends Employee implements Acountable{

	public Nurse(String name, String lastName, double salary) {
		super(name, lastName, salary);
		this.setJob(Occupation.NURSE);	
		
	}

	@Override
	public String increaseSalary() {
		double newSalary = getSalary() * 1.2;
		setSalary(newSalary);
		return "New salary is: " + newSalary;
	}
	
	@Override
	public String toString() {
		return "Nurse [Salary=" + getSalary() + ", Name=" + getName() + ", LastName=" + getLastName()
				+ ", Job=" + getJob() + "]";
	}
	
	

}
