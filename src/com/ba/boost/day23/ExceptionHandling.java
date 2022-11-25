package com.ba.boost.day23;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			
			int myInt1 = Integer.parseInt("5a");
			System.out.println(myInt1);
			
			
			int myInt = Integer.parseInt("5");
			System.out.println(myInt);
			
	
		} catch (NumberFormatException e) {
			
//			e.printStackTrace();
			System.out.println("Stop trying convert a text to a number");
			
		} finally {
			
			System.out.println("Finally block");
			
		}
		
		System.out.println("Code continues...");
	}

}
