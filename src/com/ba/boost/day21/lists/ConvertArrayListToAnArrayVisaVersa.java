package com.ba.boost.day21.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListToAnArrayVisaVersa {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		
		System.out.println(languages);
		
		//Arraylist convert to array.
		String[] arrays = new String[languages.size()];
		languages.toArray(arrays);
		
		System.out.println(Arrays.toString(arrays));
		
		//Array convert to Arraylist
		ArrayList<String> languages2 = new ArrayList<>(Arrays.asList(arrays));
		System.out.println(languages2);
	}

}
