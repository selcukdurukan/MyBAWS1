package com.ba.boost.day12;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Widening
		
		int myInt = 5;
		
		double myDouble = myInt;
		
		System.out.println(myInt);   //Implicit typecasting - Widening - automatic casting. int to double.
		System.out.println(myDouble);

		//Narrowing 
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2;
		
		System.out.println(myDouble2); //Explicit typecasting - narrowing - manuel casting. double to int.
		System.out.println(myInt2);
		
		// Type conversion int to String.
		
		int num = 10;
		System.out.println("The integer value is: " + num);
		
		String data = String.valueOf(num); // converts integer to String. 
		System.out.println("The string value is: " +data);
		
		//Type conversion from String to int.
		
		String data2 = "15";
		System.out.println("The string value is: " +data2);
		int num2 = Integer.parseInt(data2);  // converts String to int.
		System.out.println("The int value is: " +num2);
		int num3 = num2 + num2;	
		System.out.println(num3);
		
		
		String x ="15";
		Integer x1 = Integer.valueOf(x);
		Integer x2 =Integer.parseInt(x);
		
		
		
		
		
		 
	}

}
