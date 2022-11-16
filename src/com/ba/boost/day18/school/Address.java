package com.ba.boost.day18.school;

public class Address {
	
	private String city;
	private String street;
	private long zipCode;
	
	public Address(String city, String street, long zipCode) {
		super();
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", zipCode=" + zipCode + "]";
	}
	
	
	
	

}
