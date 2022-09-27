package com.ba.boost.day08;

import java.util.Scanner;

public class Triangle {
	
static Scanner sc = new Scanner(System.in);

	void triangleCal() {

		
		System.out.print("Please enter first angle: ");
		double fAngle = sc.nextDouble();
		
		System.out.print("Please enter first side opposite the first angle: ");
		double fSide = sc.nextDouble();

		System.out.print("Please enter second angle: ");
		double sAngle = sc.nextDouble();
		
		System.out.print("Please enter second side opposite the second angle: ");
		double sSide = sc.nextDouble();
		
		double tAngle = (180- fAngle - sAngle);
		System.out.println("Your third angle is: " + tAngle);
		
		tAngle = Math.toRadians(tAngle);
		
		double result;
		result = (Math.pow(fSide, 2) + (sSide*sSide)) + ((2*fSide*sSide)*(Math.cos(tAngle)));
	
		System.out.println("Your third side lenght opposite the third side : " + Math.sqrt(result));
	
		
	}

	public static void main(String[] args) {
		
		Triangle x = new Triangle();
		x.triangleCal();
	}
}

