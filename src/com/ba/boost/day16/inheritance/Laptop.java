package com.ba.boost.day16.inheritance;

public class Laptop extends Computer{
	
	private int batteryCapacity;

	public Laptop() {
		super();
	}
	public Laptop(String brand, int ramSize, double ssdCapacity, double screenSize, String operatingSystem,
			int batteryCapacity) {
		super(brand, ramSize, ssdCapacity, screenSize, operatingSystem);
		this.batteryCapacity = batteryCapacity;
	}
	
	
	void stateOfCharge() {
		
		if (this.batteryCapacity < 20) {
			System.err.println(getBrand() + ": Battery Low -- %"+this.batteryCapacity);	
		}else {
			System.out.println(getBrand() + ": Battery Level -- %"+this.batteryCapacity);	
		}
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	
	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", toString()=" + super.toString() + "]";
	}
	@Override
	void showFeatures() {
		System.out.println("Laptop [batteryCapacity=" + batteryCapacity + ", toString()=" + super.toString() + "]");
	}
	
	
	
	
	
	

}
