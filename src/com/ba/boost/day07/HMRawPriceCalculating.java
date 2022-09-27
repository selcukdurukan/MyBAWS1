package com.ba.boost.day07;

import java.util.Scanner;

public class HMRawPriceCalculating {
	
static Scanner sc = new Scanner(System.in);

void rawPrice() {
	
	System.out.print("Please enter raw price with tax and profit: ");
	double totalPrice = sc.nextDouble();
	sc.close();
	
	System.out.println("Your raw price after subtraction tax and profit: " +(((totalPrice*100)/(118))*100)/(115) + " TL");
	
}

	public static void main(String[] args) {
		
			HMRawPriceCalculating getP = new HMRawPriceCalculating();
			getP.rawPrice();
			
	}

}
