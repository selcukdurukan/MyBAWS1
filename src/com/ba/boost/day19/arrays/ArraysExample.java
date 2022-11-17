package com.ba.boost.day19.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		int[] arrays = {2,-9,0,5,12,-25,22,9,8,12};
		
		Arrays.sort(arrays);
		
		System.out.println(Arrays.toString(arrays));
		
		
		double sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			sum = sum + arrays[i];
		}
		
		double avg = sum / arrays.length;
		
		System.out.println("SUM: " + sum);
		
		System.out.println("AVG: " + avg);
		

	}

}
