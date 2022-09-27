package com.ba.boost.day12;

public class RecursiveFactorial {

	public static void main(String[] args) {
	
		double a =recursiveF(5);
		System.out.println(a);
		
	}

	private static int recursiveF(int a) {
		if(a == 1 || a == 0)
			return 1;
		return a*recursiveF(a-1);
	}

}
