package com.ba.boost.week02.day7;

public class IntDouble {
	
	public double aritmetic() {
		double number = 5.5;
		double number2 = 2.1;
		double number3 = number/number2;	
		return number3;
	}

	public static void main(String[] args) {
	
		/*
		 * Between 12 and 15 could help me to convert integer to double or double to integer.
		 */
		int num = 5;
				System.out.println(num);
		double num1 = num;
				System.out.println(num1+=0.5);
		int num2 = (int) num1;
				System.out.println(num2);
				
		num +=5;
		System.out.println(num);
				
		IntDouble art = new IntDouble();
		System.out.println(art.aritmetic());
		
		
		/*
		 * Much important where is ++
		 */
		int numB = 10;
		System.out.println(numB++) ; 
		int numA = 10;
		System.out.println(++numA);
		
		
	
	}

}
