package com.ba.boost.day07;

import java.util.Scanner;


public class WhatIsYourName {
static Scanner sc =new Scanner(System.in);
private void yourName() {
	
	System.out.print("Please enter your name: ");
	String x = sc.nextLine();
	
	System.out.println("Hello " +x);
}

	public static void main(String[] args) {
		
		WhatIsYourName x = new WhatIsYourName();
		x.yourName();
		
	}

}
