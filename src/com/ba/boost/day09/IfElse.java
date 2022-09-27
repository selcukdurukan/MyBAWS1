package com.ba.boost.day09;

public class IfElse {

	public static void main(String[] args) {

		double salesTotal = 300;
		double comission = 0;
		double comissionRate = 0;
				
		if (salesTotal >= 100) {
			comissionRate = 0.5;
			comission = salesTotal*comissionRate;
		}
		//TODO track.
		
		//BEN look.
		System.out.println("My comission is: " +comission);
		
		if (salesTotal >= 200) {
			comissionRate = 0.3;
			comission = salesTotal*comissionRate;
		}else {
			comissionRate = 0.6;
			comission = salesTotal*comissionRate;
		}
		
		System.out.println("My second comission is: " +comission);

	}

}
