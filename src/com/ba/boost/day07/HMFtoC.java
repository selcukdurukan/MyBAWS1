package com.ba.boost.day07;

import java.util.Scanner;

public class HMFtoC {
	
static Scanner sc = new Scanner(System.in);

static void convertingCtoF() {
	
	System.out.print("Please enter your celcius degree: ");
	double celcius = sc.nextDouble();   // °F =°C * 1.8000+ 32.00
	
	System.out.println("Your celcius degree is " + celcius + " and your fahrenheit degree is " + ((celcius * 1.8) + 32));
	
}
	public static void main(String[] args) {
		
			HMFtoC.convertingCtoF();
	}

}
