package com.ba.boost.day12;

public class RecursiveHelloWorld {

	public static void main(String[] args) {

		helloWorldForever(0);
	}

	private static void helloWorldForever(int counter) {
		counter ++;
		System.out.println(counter + ". " + "Hello World");
		if(counter == 7120) return;
		else helloWorldForever(counter);
	}

}
