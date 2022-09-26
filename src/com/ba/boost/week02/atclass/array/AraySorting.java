package com.ba.boost.week02.atclass.array;

import java.util.Arrays;

public class AraySorting {

	public static void main(String[] args) {
		// {3,7,3,12,43,54,43,28,3,19,-24,-19}
		int[] list = {3,7,3,12,43,54,43,28,3,19,-24,-19};
		
		System.out.println("Your array list is: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		
		Arrays.sort(list);
		System.out.println("\n\n Your array list after sorting: ");
	    for (int j : list) {
			System.out.print(j + " ");
		}
	}

}
