package com.ba.boost.day20.arraypractice;

import java.util.Arrays;

public class TwoDimensionArrayExp {

	public static void main(String[] args) {
		
		//jagged array
		int arr[][] = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		System.out.println(Arrays.deepToString(arr));
		

	}

}
