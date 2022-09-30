package com.ba.boost.day12;

public class HMRecursiveAdd {

	public static void main(String[] args) {
		
		System.out.println(recursiveAdd(10, 13));

	}

	private static int recursiveAdd(int a, int b) {
		if (a>b) {
			return a;
		}
		if (a==b) {
			return a;
		}
		if (a==b+1 || a+1 == b) {
			return a+b;
		}
		int result = a+b;
		return result + recursiveAdd(a+1,b-1);
	}

}
