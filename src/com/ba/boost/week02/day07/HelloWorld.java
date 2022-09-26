package com.ba.boost.week02.day07;

public class HelloWorld {
	
	   void ConsoleGreeting() {
	
		System.out.print("Hello World.");
	}
	   
	   static void ConsoleGreeting1() {
			
		   System.out.print("Hello World.");
	   }

	public static void main(String[] args) {
		
		/*
		 * This way can be used when ConsoleGreeting is unstatic because of my main method is static 
		 */
		HelloWorld greeting = new HelloWorld();
		greeting.ConsoleGreeting();

		System.out.println();

		/*
		 * This way can be used when ConsoleGreeting1 is static because of my main method is static..
		 */
		ConsoleGreeting1();
		
	}
}
