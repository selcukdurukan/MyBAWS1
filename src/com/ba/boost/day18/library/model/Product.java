package com.ba.boost.day18.library.model;

import java.time.LocalDate;

public abstract class Product {

	private String name;
	private LocalDate productionDate;
	private int availableAmount;
	private double basePrice;

	public Product(String name, LocalDate productionDate, int availableAmount, double basePrice) {
		super();
		this.name = name;
		this.productionDate = productionDate;
		this.availableAmount = availableAmount;
		this.basePrice = basePrice;
	}

	public Product() {
		super();
	}



	public void sellProduct(int amount, double discountRate) {
		if (amount < this.availableAmount) {
			double price = this.basePrice - (this.basePrice * discountRate);
			double endPrice = price * amount;
			System.out.println(amount + " adet " + this.name + " adli urunun toplam satis fiyatı: " + endPrice);
			this.availableAmount -= amount;
		} else {
			System.out.println("Almak istediginiz urunden yeteri kadar yok.");
		}

	}

	public int getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getName() {
		return name;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", productionDate=" + productionDate + ", availableAmount=" + availableAmount
				+ ", basePrice=" + basePrice + "]";
	}
	
	

}
