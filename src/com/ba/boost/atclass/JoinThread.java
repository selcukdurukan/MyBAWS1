package com.ba.boost.atclass;

public class JoinThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);	
		}
	}
	
	

	public static void main(String[] args) {
		
		JoinThread t1 = new JoinThread();
		JoinThread t2 = new JoinThread();
		JoinThread t3 = new JoinThread();
		JoinThread t4 = new JoinThread();
		JoinThread t5 = new JoinThread();
		JoinThread t6 = new JoinThread();
		JoinThread t7 = new JoinThread();
		JoinThread t8 = new JoinThread();
		JoinThread t9 = new JoinThread();
		JoinThread t10 = new JoinThread();
		JoinThread t11 = new JoinThread();
		JoinThread t12 = new JoinThread();
		JoinThread t13 = new JoinThread();
		JoinThread t14 = new JoinThread();
		JoinThread t15 = new JoinThread();
		JoinThread t16 = new JoinThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		
	}



}
