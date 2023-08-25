package com.ba.boost.day64and65.deneme4;

public class Person {

	private String name;
	private Passport passport;

	@Override
	public String toString() {
		return "Person{name=" + name + ",passport=" + passport + "}";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
