package com.ba.boost.day35.builder;

public class House {

	private String street;
	private String city;
	private int doorNumber;
	private int numOfStoreys;
	private int numOfRooms;
	private int numOfWCs;
	private boolean apartment;
	private int usableSpace;
	private KitchenType kitchenType;
	private int numBalconies;
	private boolean patio;
	private boolean terrace;

	public House(String street, String city, int doorNumber, int numOfStoreys, int numOfRooms, int numOfWCs,
			boolean apartment, int usableSpace, KitchenType kitchenType, int numBalconies, boolean patio,
			boolean terrace) {
		super();
		this.street = street;
		this.city = city;
		this.doorNumber = doorNumber;
		this.numOfStoreys = numOfStoreys;
		this.numOfRooms = numOfRooms;
		this.numOfWCs = numOfWCs;
		this.apartment = apartment;
		this.usableSpace = usableSpace;
		this.kitchenType = kitchenType;
		this.numBalconies = numBalconies;
		this.patio = patio;
		this.terrace = terrace;
	}

	public House(String street, String city, int doorNumber, int numOfStoreys, int numOfRooms, int numOfWCs,
			boolean apartment, int usableSpace, KitchenType kitchenType, boolean terrace) {
		super();
		this.street = street;
		this.city = city;
		this.doorNumber = doorNumber;
		this.numOfStoreys = numOfStoreys;
		this.numOfRooms = numOfRooms;
		this.numOfWCs = numOfWCs;
		this.apartment = apartment;
		this.usableSpace = usableSpace;
		this.kitchenType = kitchenType;
		this.terrace = terrace;
	}

}
