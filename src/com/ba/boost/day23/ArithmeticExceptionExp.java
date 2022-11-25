package com.ba.boost.day23;

public class ArithmeticExceptionExp {

	public static void main(String[] args) {
	
		try {
			
			int result = 5 / 0; 
			System.out.println(result);
			
		} catch (ArithmeticException | NullPointerException e) {
			
			System.err.println("It couldn't be divided zero");
			e.printStackTrace();

			
		} finally {
			
			System.err.println("This runs everytime.");
		}

	}

}
