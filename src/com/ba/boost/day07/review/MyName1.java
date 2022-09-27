package com.ba.boost.day07.review;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MyName1 {

	public static void name() {

		JOptionPane.showConfirmDialog(null, "My name is Selcuk.");
	}

	static void mathArt() {
		int a = 13;
		int b = 0;
	}
	
	public double exchangeRate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please write exchange rate to convert dollar from turkish lira: ");
	    double d = sc.nextDouble();
	    sc.nextLine();
	    
	    System.out.print("Please write your turkish liras money: ");
	    double b = sc.nextDouble();
	    sc.nextLine();
	    
	    double result = b/d;
	    System.out.print("Your money after converting is : " +result);
		return result;
	} {
		
	}

}
