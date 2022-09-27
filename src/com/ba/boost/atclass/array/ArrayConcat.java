	package com.ba.boost.atclass.array;

import java.util.ArrayList;

public class ArrayConcat {
	
	
    public static void main(String[] args) {
   
    	int a = 3;
    	System.out.println(a++);
    	System.out.println(a);
    	
    	ArrayList<Integer> array1 = new ArrayList<Integer>();
    	array1.add(1);
    	array1.add(2);
    	array1.add(3);
    	array1.add(5);
    	array1.add(8);
    	
    	ArrayList<Integer> array2 = new ArrayList<Integer>();
    	array2.add(3);
    	array2.add(6);
    	array2.add(5);

    	System.out.print("Your first array list is: \n");
    	for (int i : array1) {
			System.out.println(i);
		}
    	
    	System.out.print("\nYour second array list is: \n");
    	for (int i : array2) {
			System.out.println(i);
		}
    	
    	System.out.print("\nAfter merging you array is:");
    	array1.addAll(array2);
    	for (int i : array1) {
			System.out.print(" " + i);
		}
	}


}
