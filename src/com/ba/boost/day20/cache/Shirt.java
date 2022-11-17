package com.ba.boost.day20.cache;

public class Shirt {

	private String label;
	private String color;

	public Shirt(String label, String color) {
		super();
		this.label = label;
		this.color = color;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shirt [label=" + label + ", color=" + color + "]";
	}

}
