package com.ba.boost.day17.bakkal.model;

public class Customer extends Person {

	private static int numOfCustomer = 0;

	// CUS-0001, CUS-0001
	public Customer(String firstName, String lastName) {
		super(firstName, lastName);

	}

	@Override
	public String generateId() {
		String custId = "CUS-";
		Customer.numOfCustomer++;
		custId = String.format("%s%04d", custId, Customer.numOfCustomer); // https://www.javatpoint.com/java-string-format
		return custId;
	}

	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}

}
