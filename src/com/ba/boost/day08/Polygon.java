package com.ba.boost.day08;

import java.util.Scanner;

public class Polygon {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Please write edges of polyon (More than 3): ");
		int edge = sc.nextInt();
		
		System.out.print("Please write lenght of edge: ");
		int lenght = sc.nextInt();
		
		double area = (edge * (Math.pow(lenght, 2))) / (4*Math.tan((Math.PI)/(edge))); 
		System.out.println("Your area is: " +area + " br^2");
	}

}
