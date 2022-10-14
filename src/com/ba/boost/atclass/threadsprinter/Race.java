package com.ba.boost.atclass.threadsprinter;

public class Race {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Sprinter("Ali"));
		thread.start();

	}

}
