package com.ba.boost.day33.threadwithcagri;

public class CreateAThreadRunnable implements Runnable {

	public static void main(String[] args) {

		CreateAThreadRunnable obj = new CreateAThreadRunnable();
		Thread t1 = new Thread(obj, "My Thread");
		t1.start();

		Thread t2 = new Thread(obj);
		t2.start();

		Thread t3 = new Thread(obj);
		t3.start();

	}

	@Override
	public void run() {
		System.out.println("Thread is running....." + Thread.currentThread().getName());

	}

}
