package com.ba.boost.day20.HWproductlist;

public class Product {
	
	private String productName;
	private AmountType amountType;
	private int amount;
	
	public Product(String productName, AmountType amountType, int amount) {
		super();
		this.productName = productName;
		this.amountType = amountType;
		this.amount = amount;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public AmountType getAmountType() {
		return amountType;
	}
	public void setAmountType(AmountType amountType) {
		this.amountType = amountType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", amountType=" + amountType + ", amount=" + amount + "]";
	}
	
	
	
	

	
	
	
	

}
