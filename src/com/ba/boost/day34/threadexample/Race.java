package com.ba.boost.day34.threadexample;

public class Race {

	 void race() {

		double startTime = System.currentTimeMillis();
		for (int i = 0; i <= 100; i++) {
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 10 == 0) {
				System.out.println(Thread.currentThread().getName() + " is " + " at the " + i + ". meter" + " "
						+ ((System.currentTimeMillis() - startTime)) + "  milis");
			}
		}
		double stopTime = System.currentTimeMillis();
		System.out.println(Thread.currentThread().getName() + " finished time: " + (((stopTime - startTime)/1000)) + " seconds.");
	}
	
	

}
