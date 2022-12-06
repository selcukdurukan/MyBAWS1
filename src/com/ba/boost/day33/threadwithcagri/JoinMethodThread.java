package com.ba.boost.day33.threadwithcagri;

public class JoinMethodThread extends Thread {

	public static void main(String[] args) {

		JoinMethodThread t1 = new JoinMethodThread();
		JoinMethodThread t2 = new JoinMethodThread();
		JoinMethodThread t3 = new JoinMethodThread();
		t1.start();
		try {
			t1.join(1000); /// 1000 bitince diğer threadler de devreye girer, eğer sadece join() çalışırsa
							/// t1 bittikten sonra diğer threadler devreye girer.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		t3.start();

	}

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}

	}

}
