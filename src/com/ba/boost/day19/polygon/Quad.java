package com.ba.boost.day19.polygon;

import java.util.Scanner;

public class Quad implements CalculateableArea{

	@Override
	public double theAreaOfPolygon() {
		
		System.out.print("Please write H (altitude): ");
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		
		System.out.print("Please write B (the lenght of the base): ");
		double b = sc.nextDouble();
		
		double result = b * h;
		
		System.out.println("THE AREA OF THE QUAD IS: " +result);
		
		return result;
	}

}
