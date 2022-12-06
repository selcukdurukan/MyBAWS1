package com.ba.boost.day34;

public class Thread1 extends Thread {

	Table table;

	public Thread1(Table table) {
		super();
		this.table = table;
	}

	@Override
	public void run() {
		table.printTable(5);

	}

}
