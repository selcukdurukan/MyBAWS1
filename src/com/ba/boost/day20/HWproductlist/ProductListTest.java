package com.ba.boost.day20.HWproductlist;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductListTest {

	private TreeMap<Integer, Product> products = new TreeMap<>();
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Product> carts = new ArrayList<>();


	public static void main(String[] args) {

		ProductListTest obj = new ProductListTest();
		obj.products.put(1, new Product("Milk", AmountType.L, 5));
		obj.products.put(2, new Product("Sugar", AmountType.KG, 5));
		obj.products.put(3, new Product("Rice", AmountType.PACKAGE, 5));
		obj.products.put(4, new Product("Water", AmountType.L, 5));
		obj.products.put(5, new Product("Chocolate", AmountType.PACKAGE, 5));
		obj.products.put(6, new Product("Armut", AmountType.KG, 5));

		obj.menu();
		System.out.println("Bye....");

	}

	private void menu() {

		while (true) {
			System.out.println("Welcome my supermarket...");
			System.out.println("1-Look our products..");
			System.out.println("2-Add our products to your cart..");
			System.out.println("3-Look at your cart..");
			System.out.println("4-quit..");
			int input = sc.nextInt();
			switch (input) {
				case 1:
					lookProduct();
					System.out.println();
					break;
				case 2:
					addProduct();
					System.out.println();
					break;
				case 3:
					lookCart();
					System.out.println();
					break;
				case 4:
					return;
				default:
					break;
			}
		}

	}

	private void lookCart() {
		if (carts.isEmpty()) {
			System.out.println("Your cart is empty..");
		}
		int buyProductNumber = 1;
		for (int i = 0; i < carts.size(); i++) {
			System.out.println(buyProductNumber + ". " + carts.get(i));
			buyProductNumber++;
		}

	}

	private void addProduct() {

		while (true) {
			System.out.println("\tPlease write key.\n\t0-For quit.");
			int keyInput = sc.nextInt();
			if (keyInput == 0) {
				break;
			}
			
			System.out.println(products.get(keyInput));
			System.out.println("How many amounts do you wanna buy?");
			int buyAmount = sc.nextInt();
			if (buyAmount > products.get(keyInput).getAmount()) {
				System.out.println("We haven't had " + buyAmount + " " + products.get(keyInput).getProductName() + ". "
						+ "You can only buy " + products.get(keyInput).getAmount() + " "
						+ products.get(keyInput).getProductName() + ".");
			} else {
				int newAmount = products.get(keyInput).getAmount() - buyAmount;
				products.get(keyInput).setAmount(newAmount);
				carts.add(new Product(products.get(keyInput).getProductName(), products.get(keyInput).getAmountType() , buyAmount));
				int buyProductNumber = 1;
				for (int i = 0; i < carts.size(); i++) {
					System.out.println(buyProductNumber + ". " + carts.get(i));
					buyProductNumber++;
				}
				products.get(keyInput).setAmount(newAmount);
			}
		}
	}

	private void lookProduct() {

		for (Map.Entry<Integer, Product> i : products.entrySet()) {
			int key = i.getKey();
			Product value = i.getValue();
			System.out.println(key + ") " + value);
		}
	}

}
