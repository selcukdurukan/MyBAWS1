package com.ba.boost.day16.bakkal.model;

import java.time.LocalDate;

public class Product {
	
	private String name;
	private String unit;
	private double unitPrice;
	protected int quantity;
	private LocalDate productionDate;
	
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", unit=" + unit + ", unitPrice=" + unitPrice + ", quantity=" + quantity
				+ ", productionDate=" + productionDate + "]";
	}
	
	
	
	
	
}
