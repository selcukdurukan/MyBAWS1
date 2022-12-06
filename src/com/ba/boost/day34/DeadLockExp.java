package com.ba.boost.day34;

public class DeadLockExp {

	public static void main(String[] args) {
		/*
		 * Thread 1 r1'i kaynak olarak tutuyor, t2 r2'yi kaynak olarak tutuyor ve t1
		 * hiçbir zaman r2'yi t2'de r1'i çalıştıramıyor. Sonuç olarak kurgulama yaparken
		 * hangi thread'in hangi kaynağı yönettigini önem ver çünkü program bu şekilde
		 * kilitlenip kalabilir.
		 */

		String r1 = "Selcuk";
		String r2 = "Durukan";

		// Ayrı bir sınıf oluşturup run methodunu içinde çalıştırmak gibi davranır.
		Thread t1 = new Thread() {

			@Override
			public void run() {

				// Kaynak olarak r1'i kullanır, işlem bitene kadar kilitler.
				synchronized (r1) {
					System.out.println("Thread 1: Locked resource 1 ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Kaynak olarak r2'i kullanır, işlem bitene kadar kilitler (bu block diger
					// kilitli r1 blogunun içinde)
					synchronized (r2) {
						System.out.println("Thread 1: Locked resource 2 ");

					}
				}
			}
		};

		Thread t2 = new Thread() {

			@Override
			public void run() {

				// Kaynak olarak r1'i kullanır, işlem bitene kadar kilitler.
				synchronized (r2) {
					System.out.println("Thread 2: Locked resource 2 ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// Kaynak olarak r2'i kullanır, işlem bitene kadar kilitler (bu block diger
					// kilitli r1 blogunun içinde)
					synchronized (r1) {
						System.out.println("Thread 2: Locked resource 1 ");

					}
				}
			}
		};

		t1.start();

		/*
		 * Join ile önce t1 biter sonra t2 dolasıyla resource sıkıntısı yaşanmaz.
		 */

//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		t2.start();

	}

}
