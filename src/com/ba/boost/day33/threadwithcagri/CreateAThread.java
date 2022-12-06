package com.ba.boost.day33.threadwithcagri;

public class CreateAThread extends Thread{

	public static void main(String[] args) {
		
		CreateAThread create = new CreateAThread();
		create.start();
		
		CreateAThread create1 = new CreateAThread();
		create1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread is running.." + Thread.currentThread().getName());
		super.run();
	}

}
