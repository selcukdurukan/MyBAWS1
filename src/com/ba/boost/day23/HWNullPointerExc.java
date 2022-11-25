package com.ba.boost.day23;

public class HWNullPointerExc {

	public static void main(String[] args) {
		
		methodToPrint();
		System.out.println("A finished");

	}

	private static void methodToPrint() {
		
		try {
			printOnScreen();
		} catch (NullPointerException e) {
			System.err.println(e.getMessage() + e.getClass());
		}
		System.out.println("B finished");
	}

	private static void printOnScreen() throws NullPointerException{
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.err.println("Error!!!");
			throw new NullPointerException();
		} finally {
			System.err.println("HEEYYYY!!");
		}
		System.out.println("C finished");
	}

}
