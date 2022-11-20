package com.ba.boost.day21;

public class StringTest {

	public static void main(String[] args) {
		
		String a = new String();
		a= "Merhaba";
		String b = new String();
		b = "Merhaba";
		
		String c = new String("Hello");
		String d = new String("Hello");
		
		if (a==b) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		if (c==d) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}

	}

}
