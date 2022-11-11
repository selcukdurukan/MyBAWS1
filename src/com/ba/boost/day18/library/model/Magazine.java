package com.ba.boost.day18.library.model;

import java.time.LocalDate;

public class Magazine extends Book{
	
	private int publicationNumber;

	public Magazine(String name, LocalDate productionDate, int availableAmount, double basePrice, String author,
			String publisher, String ISBN, int publicationNumber) {
		super(name, productionDate, availableAmount, basePrice, author, publisher, ISBN);
		this.publicationNumber = publicationNumber;
	}
	
	

	public Magazine(String name, LocalDate productionDate, int availableAmount, double basePrice, String author,
			String publisher, String ISBN) {
		super(name, productionDate, availableAmount, basePrice, author, publisher, ISBN);
	}
	
	
	@Override
	public void rent(int amount, Period rentalPeriod, int rentalTime) {
		System.err.println("Magazinler kiralanamaz.");
	}



	@Override
	public void returnRental(int amount) {
		System.err.println("Magazinler kiralanamaz.");
	}
	



	public int getPublicationNumber() {
		return publicationNumber;
	}

	@Override
	public String toString() {
		return "Magazine [publicationNumber=" + publicationNumber + ", toString()=" + super.toString() + "]";
	}




	
	
	
	

}
