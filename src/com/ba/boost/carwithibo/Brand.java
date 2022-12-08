package com.ba.boost.carwithibo;

public class Brand {
	
	private String brand;

	public Brand(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Brand [brand=" + brand + "]";
	}
	
	

}
