package com.ba.boost.week02.atclass.libary;

import java.time.LocalDate;

public class Book extends Product implements Rentable {


	private String author;
	private String publisher;
	private String ISBN;
	
	public Book(String name, LocalDate productionDate, int availableAmount, double basePrice, String author,
			String publisher, String iSBN) {
		super(name, productionDate, availableAmount, basePrice);
		this.author = author;
		this.publisher = publisher;
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getISBN() {
		return ISBN;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", publisher=" + publisher + ", ISBN=" + ISBN + ", getAuthor()=" + getAuthor()
				+ ", getPublisher()=" + getPublisher() + ", getISBN()=" + getISBN() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int getAvaibleAmountInfo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNameInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAmountInfo(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	
}
