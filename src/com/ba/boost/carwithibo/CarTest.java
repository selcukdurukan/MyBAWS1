package com.ba.boost.carwithibo;

public class CarTest {

	public static void main(String[] args) {
		
		DoorNumber n = new DoorNumber(4);
		Brand b = new Brand("BMW");
		Door d = new Door(DoorType.BUTTERFLY);
		Coachbuilder c = new Coachbuilder(d, b, n);
		System.out.println(c);
		
		
		
		
		
	
		
		

	}

}
