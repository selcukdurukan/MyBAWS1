package com.ba.boost.day36.furnitureshop;

public abstract class Furniture {
	
	private IFurnitureStyle kind;
	private String color;
	private int price;
	
	protected abstract void construct();
	
	public Furniture(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	public IFurnitureStyle getKind() {
		return kind;
	}

	public void setKind(IFurnitureStyle kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Furniture [color=" + color + ", price=" + price + "]";
	}
	
	
	
	

}
