package com.ba.boost.day64and65.newdeneme5;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers1 = new ArrayList<>();
		
		numbers.add(2);
		
		numbers.add(3);
		
		numbers.add(5);
		
		numbers.stream().forEach(x -> {
			x = x*2;
			numbers1.add(x);
		});
		
		System.out.println(numbers1.toString());

	}
	



}
