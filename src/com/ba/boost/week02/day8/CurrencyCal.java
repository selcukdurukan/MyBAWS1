package com.ba.boost.week02.day8;

/**
 * @author Selcuk.Durukan
 * @version 1.0
 * This type comment name is Java-Doc.
 */


/*
 * This type comment name is c-like or block comment.
 */

// This type comment name is inline comment. 

import java.util.Scanner;

public class CurrencyCal {
	
 
	static Scanner sc = new Scanner(System.in);

	private void converting() {

		System.out.print("Please enter exchange rate: ");
		double ExchangeRate = sc.nextDouble();

		System.out.print("Please enter amount of money which you convert from TL to dollar : ");
		double Money = sc.nextDouble();

		sc.close();

		System.out.println("After converting process, your TL amount is: " + Money / ExchangeRate + " TL");
	}

	public static void main(String[] args) {

		CurrencyCal x = new CurrencyCal();
		x.converting();

	}

}
