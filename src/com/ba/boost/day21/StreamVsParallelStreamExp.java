package com.ba.boost.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStreamExp {

	public static void main(String[] args) {
		
		
		ArrayList<String> strings = new ArrayList<>();
		//String arrayListine öge eklemenin bir yolu.
		strings.add("Customer 1");
		strings.add("Customer 2");
		strings.add("Customer 3");
		
		// Bir başka yol ise sanki array tanımlar gibi
		List<String> strings1 = new ArrayList<>();
		strings1 = Arrays.asList("Student 1", "Student 2", "Student 3");
		
		//Normal for döngüsü kullanarak liste ögelerini ekrana yazdırma.
		System.out.println("Normal Foreach döngüsü");
		for (String i : strings) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//Streamlerin akıŞını kullanarak liste ögelerini ekrana yazdırmak için.
		System.out.println("Klasik STREAM");
		strings.stream().forEach(s -> System.out.println(s + ", Kullanilan tread: " + Thread.currentThread()));
		
		System.out.println();
		
		//Streamlerin akılını kullanarak liste ögelerini ekrana yazdırmak için.
		System.out.println("parallel STREAM");
		strings.parallelStream().forEach(s -> System.out.println(s + ", Kullanilan tread: " + Thread.currentThread()));
		
		
		
		

	}

}
