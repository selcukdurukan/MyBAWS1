package com.ba.boost.day64and65.deneme4;

public class Passport {

	private String country;
	private String number;
	private Person owner;

	@Override
	public String toString() {
		return "Passport [country=" + country + ", number=" + number + ", owner=" + owner + "]";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
