package com.ba.boost.day24.etuthospital;

public class Doctor extends Employee implements Acountable{

	public Doctor(String name, String lastName, double salary) {
		super(name, lastName, salary);
		this.setJob(Occupation.DOCTOR);
	}

	@Override
	public String increaseSalary() {
		double newSalary = getSalary() * 1.3;
		setSalary(newSalary);
		return "New salary is: " + newSalary;
	}

	@Override
	public String toString() {
		return "Doctor [Salary=" + getSalary() + ", Name=" + getName() + ", LastName=" + getLastName()
				+ ", Job=" + getJob() + "]";
	}
	
	

}
