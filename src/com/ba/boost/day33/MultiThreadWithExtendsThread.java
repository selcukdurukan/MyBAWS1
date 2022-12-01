package com.ba.boost.day33;

public class MultiThreadWithExtendsThread extends Thread{
	
	/*
	 * Threadlerle çalışmanın diğer bir yolu.
	 */

	public static void main(String[] args) {
		
		MultiThreadWithExtendsThread thread = new MultiThreadWithExtendsThread();
		thread.start();
		
		MultiThreadWithExtendsThread thread1 = new MultiThreadWithExtendsThread();
		thread1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread: " + Thread.currentThread().getName());
	}

}
