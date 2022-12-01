package com.ba.boost.day33;

public class MultiThreadWithRunnableInterface implements Runnable{
	
	/*
	 * threadleri çalıştırmanın bir yolu.
	 */

	public static void main(String[] args) {
		
		MultiThreadWithRunnableInterface multi = new MultiThreadWithRunnableInterface();
		Thread t1 = new Thread(multi);
		t1.start();
		
		Thread t2 = new Thread(multi);
		t2.start();
		
		Thread t3= new Thread(multi);
		t3.start();

	}

	@Override
	public void run() {
		System.out.println("Thread calisiyor. " + Thread.currentThread().getName());
		
	}

}
