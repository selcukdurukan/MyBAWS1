package com.ba.boost.day16.phone;

public class Phone {
	
	private String brand;
	private double cameraMP;
	private int batteryCapacity = 100;  //0-100
	private double screnSize;
	
	
	void connectWeb() {
		System.out.println(this.brand + " connected to web." );
	}
	void takePhote() {
		System.out.println(this.brand + " took a photo.");
		this.batteryCapacity = this.batteryCapacity - 25;
	}
	void showFeatures() {
		System.out.println("Phone [brand=" + brand + ", cameraMP=" + cameraMP + ", batteryCapacity=" + batteryCapacity
				+ ", screnSize=" + screnSize + "]");
	}
	
	
	public Phone() {
		super();
	}
	public Phone(String brand, double cameraMP, double screnSize) {
		super();
		this.brand = brand;
		this.cameraMP = cameraMP;
		this.screnSize = screnSize;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCameraMP() {
		return cameraMP;
	}
	public void setCameraMP(double cameraMP) {
		this.cameraMP = cameraMP;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public double getScrenSize() {
		return screnSize;
	}
	public void setScrenSize(double screnSize) {
		this.screnSize = screnSize;
	}
	
	
	

	
	
}
