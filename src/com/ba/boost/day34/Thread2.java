package com.ba.boost.day34;

public class Thread2 extends Thread {

	Table table;

	public Thread2(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(5);
		System.out.println("2");

	}

}
