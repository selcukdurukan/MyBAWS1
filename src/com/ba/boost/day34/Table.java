package com.ba.boost.day34;

public class Table {

	// Eğer synchronized'ı kullanırsan tek bir thread girebilir bu method'a
	synchronized void printTable(int n) {

		for (int i = 0; i < 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Synchronized'ın farklı bir kullanım şekli, yukardaki gibi tek bir thread girebilir.
	void printTable1(int n) {

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
