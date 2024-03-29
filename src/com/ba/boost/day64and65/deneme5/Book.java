package com.ba.boost.day64and65.deneme5;

import java.util.Arrays;

public class Book {

	private String title;
	private int yearOfPublishing;
	private String[] authors;

	public Book(String title, int yearOfPublishing, String[] authors) {
		this.title = title;
		this.yearOfPublishing = yearOfPublishing;
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=" + Arrays.toString(authors).replace(", ", ",");
	}

}
