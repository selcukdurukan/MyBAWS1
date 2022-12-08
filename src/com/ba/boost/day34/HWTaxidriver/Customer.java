package com.ba.boost.day34.HWTaxidriver;

public class Customer implements Comparable<Customer> {

	private static final String NAME = "CUSTOMER";
	private int id = 1;

	public Customer(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getName() {
		return NAME;
	}

	@Override
	public int compareTo(Customer otherCustomer) {
		if (this.id == otherCustomer.id) {
			return 0;
		} else if (this.id < otherCustomer.id) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return getName() + "-" + getId();
	}

}
