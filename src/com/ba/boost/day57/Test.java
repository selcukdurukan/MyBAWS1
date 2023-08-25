package com.ba.boost.day57;

import java.util.Arrays;

public class Test {
	

	

	public static void main(String[] args) {
		
		int count1 = 12;
		
		int count2 = count1;
		
		count1 = 15;
		
		System.out.println(count1);
		
		int[] array1 = {2, 3};
		System.out.println(Arrays.toString(array1));
		int[] array2 = array1;
		array1[0] = 1;
		System.out.println(Arrays.toString(array2));
		
		

	}

}
