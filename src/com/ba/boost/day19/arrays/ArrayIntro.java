package com.ba.boost.day19.arrays;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//Declare an array
		int[] datas1;
		
		//allocate memory
		datas1 = new int[11];
		
		//declare and allocate
		int[] datas2 = new int[12];
		
		//declare and initialize
		int[] ages = {14,15,16,17};
		
		
		datas1[0]=12;
		datas1[1]=6;
		datas1[2]=5;
		
		System.out.println(ages[1]);
		
		System.out.println(Arrays.toString(ages));
		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(i + ". index: "+ages[i]);
		}
		
		for (int i : ages) {
			System.out.println(i);
		}
		
		System.out.println(ages[4]);

	}

}
