package com.ba.boost.day17.bakkal.model;

public class Employee extends Person {

	private static int numOFEmployee;

	// EMP-0001, EMP-0001
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public String generateId() {
		String custId = "EMP-";
		Employee.numOFEmployee++;
		custId = String.format("%s%04d", custId, Employee.numOFEmployee); // https://www.javatpoint.com/java-string-format
		return custId;
	}

}
