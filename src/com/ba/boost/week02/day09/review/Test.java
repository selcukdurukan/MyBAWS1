package com.ba.boost.week02.day09.review;

public class Test {

	public static void main(String[] args) {
		 int x,y;
		 x=43;
		 y=45;
		 String msg = x>y?"X is greater than Y":"Y is greater than X";
		 
		 System.out.println(msg);
		 
		 
		 int i = 1;
		 while (i<11) {
			System.out.println(i + ". Hello World.");
			i++;
			continue;
		}
		 System.out.println();
		 
		 int a=100;
		 do {
			System.out.println(+ a + ". Hello World.");
			a++;
		} while (a<11);
		System.out.println(); 
		
		for (int j = 1; j <= 10; j++) {
			System.out.println(j +". Hello World.");
			break;
		}
	}
}
