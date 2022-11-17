package com.ba.boost.day20.arraypractice;

import java.util.Arrays;

public class MultiDimensionArrays {

	public static void main(String[] args) {
		
		int[][] myNumbers = {{1,2,3,4}, {5,6,7} };
		
		System.out.println(myNumbers[1][2]);
		
		System.out.println(Arrays.deepToString(myNumbers));  //Printing for two dimesion arrray....
		
		System.out.println(myNumbers.length);
		
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) {
				System.out.println(i+ ". satir, " + j + ". sira: " + myNumbers[i][j]);
			}
			
		}

	}

}
