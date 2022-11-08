package com.ba.boost.day16.inheritance;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.setBrand("Monster");
		c.setOperatingSystem("Windows");
		c.setRamSize(32);
		c.setScreenSize(15.6);
		c.setSsdCapacity(1024);
		c.showFeatures();
		c.connectWeb();
		
		Computer c1 = new Computer("Dell",16,256,15.6,"Dell");
		c1.showFeatures();
		
		Laptop l = new Laptop("Apple", 16,128, 13.3, "MacOs", 100);
		l.showFeatures();
		System.out.println(l);
		l.showFeatures();
		
		
		Laptop l1 = new Laptop();
		l1.setBrand("Apple");
		l1.setBatteryCapacity(50);
		l1.stateOfCharge();
		
		Desktop d = new Desktop();
		d.setBrand("Casper");
		d.connectWeb();
	}
	

}
