package com.ba.boost.day34.HWTaxidriver;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaxiTest {

	private static Queue<Customer> customers = new ArrayDeque<>();

	public Queue<Customer> getCustomers() {
		return customers;
	}

	public static void main(String[] args) {

		TaxiTest obj = new TaxiTest();
		obj.createCustomer1();
		createTaxiDriver();

	}

	private static void createTaxiDriver() {
		TaxiDriver obj = new TaxiDriver();
		for (int i = 1; i <= 10; i++) {
			Thread driver = new Thread(obj, "Taxi Driver " + i);
			driver.start();
		}

	}

	private void createCustomer1() {
		for (int i = 1; i <= 100; i++) {
			TaxiTest.customers.add(new Customer(i));
		}
		System.out.println(TaxiTest.customers);
	}

}
