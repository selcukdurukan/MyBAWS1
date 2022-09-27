package com.ba.boost.atclass;

public class MobilePhone {

	private static String mobileBrand;
	private static double cameraMP;
	private static int bateryCapacity;
	private static double screenSize;

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public double getCameraMP() {
		return cameraMP;
	}

	public void setCameraMP(double cameraMP) {
		this.cameraMP = cameraMP;
	}

	public int getBateryCapacity() {
		return bateryCapacity;
	}

	public void setBateryCapacity(int bateryCapacity) {
		this.bateryCapacity = bateryCapacity;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	static void showFeatures() {
		System.out.println("MobilePhone [mobileBrand=" + mobileBrand + ", cameraMP=" + cameraMP + ", bateryCapacity="
				+ bateryCapacity + ", screenSize=" + screenSize + "]");
	}

}
