package com.ba.boost.day19;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTreeSet {

	public static void main(String[] args) {
		
		
		HashSet<Integer> regs1 = new HashSet<>(); //Can't be int because there is no hash code for int./ collection. General using hashset
		
		regs1.add(1);
		regs1.add(2);   //Cant be 1 because can't not be same value.

		System.out.println(regs1);
		
		TreeSet<Integer> regs2 = new TreeSet<>(); //Can't be int because there is no hash code for int./ collection. threeMap good for sorting
		
		regs2.add(1);
		regs2.add(2);
		
		System.out.println(regs2);
		
		
	}

}
