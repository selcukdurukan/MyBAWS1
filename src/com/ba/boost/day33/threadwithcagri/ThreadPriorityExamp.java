package com.ba.boost.day33.threadwithcagri;

public class ThreadPriorityExamp extends Thread {

	/*
	 * Set priority ile bir thread'in önceligini ayarlayabilirsin, her thread 5 ile
	 * başlar max priority'e ayarlarsan 10 oluyor. Sistem bu threadleri
	 * çalıştırırken zorlanırsa öncelik verilen thread'i çalıştırmaya daha fazla
	 * kaynak ayırır. Aynı görev yöneticisinde process önceliklendirme gibi.
	 */

	public static void main(String[] args) {

		ThreadPriorityExamp t1 = new ThreadPriorityExamp();
		ThreadPriorityExamp t2 = new ThreadPriorityExamp();
		ThreadPriorityExamp t3 = new ThreadPriorityExamp();

		System.out.println(t1.getPriority() + " " + t1.getName());
		System.out.println(t2.getPriority() + " " + t2.getName());
		System.out.println(t3.getPriority() + " " + t3.getName());

		t1.setPriority(MAX_PRIORITY);
		System.out.println(t1.getPriority() + " " + t1.getName());
		t2.setPriority(MIN_PRIORITY);
		System.out.println(t2.getPriority() + " " + t2.getName());

		t2.start();
		t1.start();
		t3.start();

	}

	@Override
	public void run() {

		System.out.println("Current thread name: " + Thread.currentThread().getName());

	}

}
