package com.ba.boost.day64and65.newdeneme4;

import java.util.Optional;

public class App {
	
	public static void main(String[] args) {
		
		Optional<String[]> words = Optional.of(new String[10]);
		Optional<String> word = Optional.ofNullable(words.get()[0]);
		if (word.isPresent()) {
			System.out.println("hi");
		} else {
			System.out.println("Hi");
		}
		
		Optional<String> empty = Optional.empty();
		if (empty.isPresent()) {
			System.out.println("hi");
		} else {
			System.out.println("Hi");
		}
		
		
//		String[] words1 = new String[10];
//		String word = words1[5].toLowerCase();
//		System.out.print(word);r
		
		
	}

}
