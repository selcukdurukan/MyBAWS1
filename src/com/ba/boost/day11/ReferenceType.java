package com.ba.boost.day11;

public class ReferenceType {

	public static void main(String[] args) {
		
		String x = "";   //This is empty
		System.out.println(x);
	
		String y = null; // This is null. 
		System.out.println(y);
		
		
		String helloWorld = "Hello World"; // String storage at heap and it's a reference type. - immutable.
		String helloWorld1= helloWorld;
	    String helloWorld2 = "Hello World";  //It is not null or not empty.
	    String helloWorld3 = "Lorke";
		
		if (helloWorld == helloWorld2) {
			System.out.println("They're equal.");
		} else {
			System.out.println("Not equal.");
		}

	}

}
