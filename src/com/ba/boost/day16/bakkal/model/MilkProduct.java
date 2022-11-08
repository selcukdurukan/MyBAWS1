package com.ba.boost.day16.bakkal.model;



public class MilkProduct extends Product{
	
	private int shelfLifeInDays;
	private boolean bottled;
	private boolean lactoseFree;
	private String type; // koyun - keci -inek

	
	
	public int getShelfLifeInDays() {
		return shelfLifeInDays;
	}
	public void setShelfLifeInDays(int shelfLifeInDays) {
		this.shelfLifeInDays = shelfLifeInDays;
	}
	public boolean isBottled() {
		return bottled;
	}
	public void setBottled(boolean bottled) {
		this.bottled = bottled;
	}
	public boolean isLactoseFree() {
		return lactoseFree;
	}
	public void setLactoseFree(boolean lactoseFree) {
		this.lactoseFree = lactoseFree;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void aMethod () {
		
	}
	
	@Override
	public String toString() {
		return "MilkProduct [shelfLifeInDays=" + shelfLifeInDays + ", bottled=" + bottled + ", lactoseFree="
				+ lactoseFree + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
