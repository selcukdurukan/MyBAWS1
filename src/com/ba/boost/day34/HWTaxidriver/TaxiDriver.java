package com.ba.boost.day34.HWTaxidriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaxiDriver extends Thread {

	public List<String> driverNumberOfTravellers = new ArrayList<>();

	@Override
	public void run() {
		TaxiTest obj = new TaxiTest();
		Random rnd = new Random();

		while (true) {

			synchronized (this) {
				this.driverNumberOfTravellers.add(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getName() + " has got " + obj.getCustomers().poll()
						+ " from taxi stand.");
			}

			try {
				Thread.sleep(rnd.nextInt(100, 1001));

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (obj.getCustomers().size() == 0) {
				System.out.println("\n" + Thread.currentThread().getName() + " has carried "
						+ this.driverNumberOfTravellers.stream()
								.filter(s -> s.equalsIgnoreCase(Thread.currentThread().getName())).count()
						+ " number of travellers.");
				break;
			}
		}

	}
}
