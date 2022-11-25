package com.ba.boost.day23.iowithjava.serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1429852067247303113L;
	private String name;
	private int birthDate;
	private Address[] addresses;
	private int addressNumber;
	
	
	public Person(String name, int birthDate, int numOfAddresses) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.addresses = new Address[numOfAddresses];
		this.addressNumber = 0;
	}
	
	public void addAddress(Address address) {
		
		this.addresses[this.addressNumber++] = address;
		
	}

	public String getName() {
		return name;
	}


	public int getBirthDate() {
		return birthDate;
	}


	public Address[] getAddresses() {
		return addresses;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + ", addresses=" + Arrays.toString(addresses) + "]";
	}
	
	
	
	

}
