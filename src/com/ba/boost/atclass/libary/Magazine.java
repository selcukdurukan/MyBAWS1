package com.ba.boost.atclass.libary;

import java.time.LocalDate;

public class Magazine extends Book{
	
	private int publicationNumber;

	public Magazine(String name, LocalDate productionDate, int availableAmount, double basePrice, String author,
			String publisher, String iSBN, int publicationNumber) {
		super(name, productionDate, availableAmount, basePrice, author, publisher, iSBN);
		this.publicationNumber = publicationNumber;
	}

	public int getPublicationNumber() {
		return publicationNumber;
	}

	@Override
	public String toString() {
		return "Magazine [publicationNumber=" + publicationNumber + ", toString()=" + super.toString() + "]";
	}
	
	
}
