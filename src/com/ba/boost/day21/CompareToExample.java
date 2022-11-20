package com.ba.boost.day21;

public class CompareToExample {

	public static void main(String[] args) {
		
		
		//Doğal sıra karışılaştırması
		Integer i1 = 5;
		int i2 =25;
		
		System.out.println(i1.compareTo(i2));
		
		int i3 = 123;
		System.out.println(Integer.compare(i2, i3));
		
		
		//Aynı şekilde wrapper sınıfları kullanarak tüm primitif veri tipleri veya tarih ve zaman nesneleri için doğal sıralama kullanılır.
		
		Integer a = new Integer(15);
		Integer b = new Integer(15);
		
		if (a==b) {
			System.out.println("Same");
		} else {
			System.out.println("Diffrent");
		}
		

	}
}
