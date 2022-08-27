package com.ba.boost.week02.day9;

import java.util.Scanner;

public class AgeEvaluate {

	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		
		 {
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		sc.close();
		
		if(age<0) {
			System.out.println("Please write positive number.");
		}else if (age < 18) {
			System.out.println("He or she is a age.");
		}else if (age < 30) {
			System.out.println("He or she is a young.");
		}else if (age < 50){
			System.out.println("He or she is a middle-age.");
		}else {
			System.out.println("He or she is a old.");
		}
			
		} 
		
		
		
		
	}

}
