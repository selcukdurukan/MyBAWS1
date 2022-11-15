package com.ba.boost.day18.composition;

public class Engine {

	private String type;
	private int horsePower;
	private int clinderNumber;

	public Engine(String type, int horsePower, int clinderNumber) {
		super();
		this.type = type;
		this.horsePower = horsePower;
		this.clinderNumber = clinderNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getClinderNumber() {
		return clinderNumber;
	}

	public void setClinderNumber(int clinderNumber) {
		this.clinderNumber = clinderNumber;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", horsePower=" + horsePower + ", clinderNumber=" + clinderNumber + "]";
	}

	
	
}
