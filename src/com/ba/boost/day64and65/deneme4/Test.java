package com.ba.boost.day64and65.deneme4;

public class Test {

	public static void main(String[] args) {

		Passport passport = new Passport();
		passport.setNumber("4343999");
		passport.setCountry("Austria");

		Person person = new Person();
		person.setName("Michael");
		System.out.println(person); // first print

		person.setPassport(passport);
		System.out.println(person.toString()); // second print
		passport.setOwner(person);
		System.out.println(passport.toString());

	}

}
