package com.ba.boost.week02.day7;

import java.util.Scanner;

public class Sum {
	static Scanner sc = new Scanner(System.in);
	
	void add() {
		System.out.print("Please enter a number: ");
		int a = sc.nextInt();
		System.out.println("Your number is increased +1 by program: " + ++a);
	}
	
	
	public static void main(String[] args) {
		
		Sum x = new Sum();
		x.add();
	} 

}
