package com.ba.boost.day18.composition;

public class CarTest {

	public static void main(String[] args) {
		
		Engine e = new Engine("Diesel", 300, 8);
		
		Car c = new Car("Mustang", e);
		System.out.println(c);
		

	}

}
