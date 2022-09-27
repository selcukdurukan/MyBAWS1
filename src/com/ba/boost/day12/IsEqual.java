package com.ba.boost.day12;

public class IsEqual {

	public static void main(String[] args) {

		int x = 5;
		int y = 5;

		if (x == y) {
			System.out.println("Equal.");
		} else {
			System.out.println("Not equal.");
		}

		Integer x1 = new Integer(5);
		Integer y1 = new Integer(5);

		if (x1 == y1) {
			System.out.println("Equal.");
		} else {
			System.out.println("Not equal.");			//Because they create new address in heap with new.
		}

		Integer x2 = 5;
		Integer y2 = 5;

		if (x2 == y2) {
			System.out.println("Equal.");
		} else {
			System.out.println("Not equal.");
		}
		
		if (x2.equals(y2)) {
			System.out.println("Equal.");
		} else {
			System.out.println("Not equal.");
		}
		
		Integer x3 = new Integer(5);
		Integer y3 = 5;
		
		if (x3 == y3) {
			System.out.println("Equal.");
		} else {
			System.out.println("Not equal.");			//Because they create new address in heap with new.
		}
		
		

	}

}
