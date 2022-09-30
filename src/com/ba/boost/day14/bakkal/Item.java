package com.ba.boost.day14.bakkal;

public class Item {

	private String name;
	private String unit; /* kg, litre, adet */
	private double unitPrice;
	private int vatRate;
	private double amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getVatRate() {
		return vatRate;
	}

	public void setVatRate(int vatRate) {
		this.vatRate = vatRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", unit=" + unit + ", unitPrice=" + unitPrice + ", vatRate=" + vatRate
				+ ", amount=" + amount + "]";
	}

}
