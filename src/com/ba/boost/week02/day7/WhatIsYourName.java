package com.ba.boost.week02.day7;

import java.util.Scanner;


public class WhatIsYourName {
static Scanner sc =new Scanner(System.in);
private void YourName() {
	
	System.out.print("Please enter your name: ");
	String x = sc.nextLine();
	
	System.out.println("Hello " +x);
}

	public static void main(String[] args) {
		
		WhatIsYourName x = new WhatIsYourName();
		x.YourName();
		
	}

}
