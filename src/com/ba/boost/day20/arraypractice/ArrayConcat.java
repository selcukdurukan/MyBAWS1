package com.ba.boost.day20.arraypractice;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		
		
		ArrayConcat.mySolve();
		ArrayConcat.teacherSolve();
	
		
	

	}

	private static void teacherSolve() {
		int[] ars1 = {3,4,5};
		int[] ars2 = {6,7,8};
		
		int[] result = new int[ars1.length + ars2.length];
		
		int pos=0;
		for (int i : ars1) {
			result[pos] = i;
			pos++;
		}
		
		for (int i : ars2) {
			result[pos] = i;
			pos++;
		}
		
		
		System.out.println(Arrays.toString(result));
		
	}

	private static void mySolve() {
		int[] arrays1 = {1, 2, 3};
		int[] arrays2 = {4, 5, 6};
		
		int[] resultArrays = new int[arrays1.length + arrays2.length];
		
		System.arraycopy(arrays1, 0, resultArrays, 0, arrays1.length);
		System.arraycopy(arrays2, 0, resultArrays, arrays1.length, arrays2.length);

	    System.out.println(Arrays.toString(resultArrays));
	    System.out.println(arrays1.length);
		
	}

}
